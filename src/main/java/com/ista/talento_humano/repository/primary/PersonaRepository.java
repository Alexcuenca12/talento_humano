package com.ista.talento_humano.repository.primary;

import com.ista.talento_humano.model.primary.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PersonaRepository extends JpaRepository<Persona, Long> {
    public Persona findByCedula(String cedula);

    @Query(value = "SELECT * FROM persona WHERE id_persona = ?", nativeQuery = true)
    List<Persona> listarPersona(@Param("idPersona") Long idPersona);

}
