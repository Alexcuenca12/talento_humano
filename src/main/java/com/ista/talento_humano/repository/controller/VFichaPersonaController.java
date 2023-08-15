package com.ista.talento_humano.repository.controller;
import com.ista.talento_humano.model.secondary.PersonaResponse;
import com.ista.talento_humano.model.primary.vfichapersona;
import com.ista.talento_humano.services.primary.VFichaPersonaService;
import com.ista.talento_humano.services.primary.VPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/vfichaP")
public class VFichaPersonaController {
    @Autowired
    VFichaPersonaService fichaPersonaService;
    VPersonaService personaService;

    @GetMapping("/read")
    public ResponseEntity<List<vfichapersona>> obtenerLista() {
        try {
            List<vfichapersona> list = fichaPersonaService.findByAll();
            return new ResponseEntity<List<vfichapersona>>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<vfichapersona> getById(@PathVariable Long id) {
        try {
            vfichapersona c = fichaPersonaService.findById(id);
            return new ResponseEntity<>(c, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<PersonaResponse>> listpersonas() {
        List<PersonaResponse> list = personaService.listaPersona();
        return new ResponseEntity<List<PersonaResponse>>(list, HttpStatus.OK);
    }


}
