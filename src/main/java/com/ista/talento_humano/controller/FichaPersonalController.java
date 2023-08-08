package com.ista.talento_humano.controller;

import com.ista.talento_humano.model.primary.FichaPersonal;
import com.ista.talento_humano.services.primary.FichaPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/fichapersoanl")
public class FichaPersonalController {
    @Autowired
    FichaPersonalService fichaPersonalService;

    @PostMapping("/create")
    public ResponseEntity<FichaPersonal> crear(@RequestBody FichaPersonal obj) {
        try {
            return new ResponseEntity<>(fichaPersonalService.save(obj), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/read")
    public ResponseEntity<List<FichaPersonal>> obtenerLista() {
        try {
            return new ResponseEntity<>(fichaPersonalService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<FichaPersonal> actualizarUsuario(@PathVariable Long id, @RequestBody FichaPersonal obj) {
        FichaPersonal fndObj = fichaPersonalService.findById(id);
        if (fndObj == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                fndObj.setCapacitaciones(obj.getCapacitaciones());
                fndObj.setCargaFamiliar(obj.getCargaFamiliar());
                fndObj.setContrato(obj.getContrato());
                fndObj.setEvaluacionDocente(obj.getEvaluacionDocente());
                fndObj.setExperiencia(obj.getExperiencia());
                fndObj.setHabilidades(obj.getHabilidades());
                fndObj.setInstruccionFormal(obj.getInstruccionFormal());
                fndObj.setPeriodoAcademico(obj.getPeriodoAcademico());
                fndObj.setPersona(obj.getPersona());
                fndObj.setRecomendaciones(obj.getRecomendaciones());
                return new ResponseEntity<>(fichaPersonalService.save(fndObj), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {

        try {
            fichaPersonalService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al elminar este registro");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/stateupdate/{id}")
    public ResponseEntity<?> actualizarEstado(@PathVariable Long id, @RequestParam String estadoRegistro) {
        FichaPersonal Registro = fichaPersonalService.findById(id);
        if (Registro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Registro.setEstado_ficha(estadoRegistro);
                return new ResponseEntity<>(fichaPersonalService.save(Registro), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
