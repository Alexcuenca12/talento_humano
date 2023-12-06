package com.ista.talento_humano.repository.controller;

import com.ista.talento_humano.model.secondary.VPersonas;
import com.ista.talento_humano.repository.secondary.VPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "https://apps.tecazuay.edu.ec" })
@RestController
@RequestMapping("talento/api/fenix")
public class FenixController {

 /*   @Autowired
    VPersonasRepository vPersonasRepository;

    // metodo para listar todas las personas
    @GetMapping(path = { "/listar" })
    public List<VPersonas> findAll() {
        return vPersonasRepository.findAll();
    }

    // metodo para buscar docente por cedula
    @GetMapping(path = { "/cedula/{cedula}" })
    public List<VPersonas> findByCedula(@PathVariable("cedula") String cedula) {
        return vPersonasRepository.findByCedula(cedula);
    }*/

}
