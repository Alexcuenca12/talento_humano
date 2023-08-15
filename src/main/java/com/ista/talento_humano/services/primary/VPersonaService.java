package com.ista.talento_humano.services.primary;
import com.ista.talento_humano.repository.primary.VFichaPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ista.talento_humano.model.secondary.PersonaResponse;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VPersonaService {
    @Autowired
    VFichaPersonaRepository vFichaPersonaRepository;


    public List<PersonaResponse> listaPersona(){
        return vFichaPersonaRepository.findAll().stream().map(vfichapersona -> {
            PersonaResponse nombre= new PersonaResponse();
            nombre.setNombres(vfichapersona.getPersona_nombres());
            nombre.setApellidos(vfichapersona.getPersona_apellidos());
            nombre.setCorreo(vfichapersona.getPersona_correo());
            nombre.setCelular(vfichapersona.getPersona_celular());
            nombre.setTelefono(vfichapersona.getPersona_telefono());
            nombre.setCa_area(vfichapersona.getCapa_area_estudios());
            return nombre;
        }).collect(Collectors.toList());
    }
}
