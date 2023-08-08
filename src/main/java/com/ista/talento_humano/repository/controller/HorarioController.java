package com.ista.talento_humano.repository.controller;

import com.ista.talento_humano.model.primary.Horario;
import com.ista.talento_humano.services.primary.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/horario")
public class HorarioController {
    @Autowired
    com.ista.talento_humano.services.primary.HorarioService HorarioService;

    @PostMapping("/create")
    public ResponseEntity<Horario> crear(@RequestBody Horario obj) {
        try {

            return new ResponseEntity<>(HorarioService.save(obj), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/read")
    public ResponseEntity<List<Horario>> obtenerLista() {
        try {
            return new ResponseEntity<>(HorarioService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Horario> actualizarHorario(@PathVariable Long id, @RequestBody Horario obj) {
        Horario fndObj = HorarioService.findById(id);
        if (fndObj == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {

                fndObj.setPeriodo(obj.getPeriodo());
                fndObj.setHorario(obj.getHorario());
                fndObj.setDias(obj.getDias());
                fndObj.setDistributivo(obj.getDistributivo());
                return new ResponseEntity<>(HorarioService.save(fndObj), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {

        try {
            HorarioService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al elminar este horario");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
