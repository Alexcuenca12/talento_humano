package com.ista.talento_humano.repository.controller;

import com.ista.talento_humano.model.primary.vfichapersona;
import com.ista.talento_humano.services.primary.VFichaPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/vfichaP")
public class VFichaPersonaController {
    @Autowired
    VFichaPersonaService fichaPersonaService;

    @GetMapping("/read")
    public ResponseEntity<List<vfichapersona>> obtenerLista() {
        try {
            return new ResponseEntity<>(fichaPersonaService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<vfichapersona> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(fichaPersonaService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
