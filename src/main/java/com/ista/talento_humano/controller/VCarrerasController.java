package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.secondary.Vcarreras;
import com.ista.talento_humano.services.secondary.VCarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/vCarrera")
public class VCarrerasController {

    @Autowired
    VCarrerasService vCarrerasService;

    @GetMapping("/read")
    public ResponseEntity<List<Vcarreras>> obtenerCarreras() {
        try {
            return new ResponseEntity<>(vCarrerasService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Vcarreras> obtenerCarrera(Long id) {
        try {
            return new ResponseEntity<>(vCarrerasService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
