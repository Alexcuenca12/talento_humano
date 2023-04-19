package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.primary.Usuario;
import com.ista.talento_humano.repository.primary.UsuarioRepository;
import com.ista.talento_humano.services.primary.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    UsuarioRepository userRepository;


    @GetMapping("/users/list")
    public ResponseEntity<List<Usuario>> getUsuariosList() {
        return ResponseEntity.ok().body(usuarioService.findByAll());
    }

    @GetMapping("/search/{username}")
    public Usuario obtenerUsuario(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PutMapping("/delete/{usuarioId}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuarioService.delete(id);
                return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuario.setUser(u.getUser());
                usuario.setPassword(u.getPassword());
                return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PostMapping("/signin")
    public Usuario IniciarSesion(@RequestBody Usuario usuario) throws Exception {
        // COMPROBAR SI sEXISTE EL NOMBRE DE USUARIO EN NUESTRA BD..
        if (userRepository.existsByUsername(usuario.getUser())) {
            // COMPROBAR SI CONINCIDE USUARIO Y CONTRASEÑA EN NUESTRA BD..
            if (userRepository.existsByPassword(usuario.getPassword())) {
                return usuarioService.search(usuario.getUser());
            } else {
                throw new Exception("Error: Datos Erroneos!");
            }
        } else {
            throw new Exception("Error: Datos Erroneos!");
        }
    }


}
