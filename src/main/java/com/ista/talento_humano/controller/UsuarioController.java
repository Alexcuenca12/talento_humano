package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.primary.Usuario;
import com.ista.talento_humano.repository.primary.UsuarioRepository;
import com.ista.talento_humano.services.primary.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService UsuarioService;
    @Autowired
    UsuarioRepository UserRepository;
    
    
    @PostMapping("/signin")
    public Usuario IniciarSesion(@RequestBody Usuario usuario) throws Exception {
        if (UserRepository.existsByUsername(usuario.getUser())) {
            if (UserRepository.existsByPassword(usuario.getPassword())) {
                return UsuarioService.search(usuario.getUser());
            } else {
                throw new Exception("Error: Datos Erroneos!");
            }
        } else {
            throw new Exception("Error: Datos Erroneos!");
        }
    }


    @GetMapping("/read")
    public ResponseEntity<List<Usuario>> getUsuariosList() {
        try {
            return new ResponseEntity<>(UsuarioService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{usuarioId}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long usuarioId, @RequestBody Usuario obj) {
        Usuario fndobj = UsuarioService.findById(usuarioId);
        if (fndobj == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                fndobj.setUser(obj.getUser());
                fndobj.setPassword(obj.getPassword());
                return new ResponseEntity<>(UsuarioService.save(fndobj), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/delete/{usuarioId}")
    public ResponseEntity<?> eliminar(@PathVariable Long usuarioId) {
        Usuario usuario = UsuarioService.findById(usuarioId);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                UsuarioService.delete(usuarioId);
                return new ResponseEntity<>(UsuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }


    @GetMapping("/search/{username}")
    public Usuario obtenerUsuario(@PathVariable Long username) {
        return UsuarioService.findById(username);
    }








}
