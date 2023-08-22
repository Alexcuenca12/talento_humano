package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.secondary.vpersonas;
import com.ista.talento_humano.repository.secondary.VPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/fenix")
public class FenixController {

    @Autowired
    VPersonasRepository vPersonasRepository;

    // metodo para listar todas las personas
    @GetMapping(path = { "/listar" })
    public List<vpersonas> findAll() {
        return vPersonasRepository.findAll();
    }

    // metodo para buscar docente por cedula
    @GetMapping(path = { "/cedula/{cedula}" })
    public List<vpersonas> findByCedula(@PathVariable("cedula") String cedula) {
        return vPersonasRepository.findByCedulaFenix(cedula);
    }

}
