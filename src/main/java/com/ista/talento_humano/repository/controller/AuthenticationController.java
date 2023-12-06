package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.JwtRequest;
import com.ista.talento_humano.model.JwtResponse;
import com.ista.talento_humano.model.UserDetailsServiceImpl;
import com.ista.talento_humano.model.primary.Usuario;
import com.ista.talento_humano.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = { "https://apps.tecazuay.edu.ec" })
@RequestMapping("/talento")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    //Este método se encarga de autenticar al usuario utilizando el AuthenticationManager y generar un token JWT válido
    // si la autenticación es exitosa. Toma un objeto JwtRequest que contiene el nombre de usuario y la contraseña proporcionados por el cliente.
    // Si la autenticación falla, se lanza una excepción. Si tiene éxito, se carga UserDetails utilizando UserDetailsService, y luego se genera un
    // token JWT utilizando JwtUtils. El token se devuelve en una respuesta JwtResponse.
    @PostMapping("/generate-token")
    public ResponseEntity<?> generarToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            autenticar(jwtRequest.getUsername(), jwtRequest.getPassword());
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new Exception("Usuario no encontrado");
        }

        UserDetails userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    //Este método es invocado por generarToken para autenticar al usuario utilizando el AuthenticationManager.
    //Toma el nombre de usuario y la contraseña y utiliza authenticationManager.authenticate para realizar la autenticación.
    //Si ocurre un error, se lanzan excepciones específicas (DisabledException y BadCredentialsException).
    private void autenticar(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException exception) {
            throw new Exception("USUARIO DESHABILITADO " + exception.getMessage());
        } catch (BadCredentialsException e) {
            throw new Exception("Credenciales invalidas " + e.getMessage());
        }
    }

    //Este método se utiliza para obtener el usuario actualmente autenticado.
    //Toma un objeto Principal como argumento, que representa al usuario autenticado.
    //Utiliza userDetailsService para cargar los detalles del usuario utilizando el nombre de usuario
    //proporcionado por principal.getName().
    @GetMapping("/actual-usuario")
    public Usuario obtenerUsuarioActual(Principal principal) {
        return (Usuario) this.userDetailsService.loadUserByUsername(principal.getName());
    }
}
