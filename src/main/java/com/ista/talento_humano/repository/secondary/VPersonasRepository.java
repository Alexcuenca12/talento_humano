package com.ista.talento_humano.repository.secondary;

import com.ista.talento_humano.model.secondary.VPersonas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VPersonasRepository extends JpaRepository<VPersonas, String> {
/*
    // metodo para listar todoas las personas
    List<VPersonas> findAll();

    // metodo para buscar una persona por su cedula id
    List<VPersonas> findByCiPasaporte(String cedula);*/

}
