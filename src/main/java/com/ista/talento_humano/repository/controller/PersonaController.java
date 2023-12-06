package com.ista.talento_humano.repository.controller;

import java.util.List;

import com.ista.talento_humano.model.primary.FichaCombinada;
import com.ista.talento_humano.services.primary.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.talento_humano.model.primary.Persona;
import com.ista.talento_humano.services.primary.PersonaService;

@CrossOrigin(origins = { "https://apps.tecazuay.edu.ec" })
@RestController
@RequestMapping("talento/api/persona")
public class PersonaController {
    @Autowired
    PersonaService PersonaService;
    @Autowired
    MiServicio miServicio;

    @PostMapping("/create")
    public ResponseEntity<Persona> crear(@RequestBody Persona obj) {
        try {
            return new ResponseEntity<>(PersonaService.save(obj), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/read")
    public ResponseEntity<List<Persona>> obtenerLista() {
        try {
            return new ResponseEntity<>(PersonaService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/combined/{id}")
    public ResponseEntity<FichaCombinada> obtenerInformacionCompleta(@PathVariable Long id) {
        try {
            FichaCombinada resultado = miServicio.obtenerInformacionCompleta(id);
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Persona> actualizarUsuario(@PathVariable Long id, @RequestBody Persona obj) {
        Persona fndObj = PersonaService.findById(id);
        if (fndObj == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                fndObj.setCi_pasaporte(obj.getCi_pasaporte());
                fndObj.setApellidos(obj.getApellidos());
                fndObj.setNombres(obj.getNombres());
                fndObj.setPais_nacimiento(obj.getPais_nacimiento());
                fndObj.setEdad(obj.getEdad());
                fndObj.setGenero(obj.getGenero());
                fndObj.setSexo(obj.getSexo());
                fndObj.setEstado_civil(obj.getEstado_civil());
                fndObj.setEtnia(obj.getEtnia());
                fndObj.setTipo_sangre(obj.getTipo_sangre());
                fndObj.setCelular(obj.getCelular());
                fndObj.setCorreo(obj.getCorreo());
                fndObj.setCorreo_institucional(obj.getCorreo_institucional());
                fndObj.setPais_residencia(obj.getPais_residencia());
                fndObj.setParroquia_recidencial(obj.getParroquia_recidencial());
                fndObj.setCalle_principal(obj.getCalle_principal());
                fndObj.setCalle_secundaria(obj.getCalle_secundaria());
                fndObj.setNumero_casa(obj.getNumero_casa());
                fndObj.setSector(obj.getSector());
                fndObj.setReferencia(obj.getReferencia());
                fndObj.setTelefono(obj.getTelefono());
                fndObj.setIdioma_raiz(obj.getIdioma_raiz());
                fndObj.setIdioma_secundario(obj.getIdioma_secundario());
                fndObj.setFoto(obj.getFoto());
                fndObj.setDiscapasidad(obj.getDiscapasidad());
                fndObj.setTipo_discapacidad(obj.getTipo_discapacidad());
                fndObj.setPorcentaje_discapacidad(obj.getPorcentaje_discapacidad());
                fndObj.setCarnet_conadis(obj.getCarnet_conadis());
                fndObj.setFoto_carnet(obj.getFoto_carnet());
                return new ResponseEntity<>(PersonaService.save(fndObj), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {

        try {
            PersonaService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al elminar este registro");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
