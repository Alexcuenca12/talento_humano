package com.ista.talento_humano.controller;


import com.ista.talento_humano.model.secondary.vpersonas;
import com.ista.talento_humano.repository.secondary.VPersonasRepository;
import com.ista.talento_humano.services.secondary.VPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/vistaPersona")
public class VPersonasController {

    @Autowired
    private VPersonasService vPersonasService;
    @Autowired
    VPersonasRepository personasRepository;


    @GetMapping("/{cedula}")
    public ResponseEntity<List<vpersonas>> getVPersonasByCedula(@PathVariable String cedula) {
        List<vpersonas> vPersonasList = vPersonasService.findByCedulaFenix(cedula);
        if (vPersonasList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(vPersonasList);
        }
    }
}
