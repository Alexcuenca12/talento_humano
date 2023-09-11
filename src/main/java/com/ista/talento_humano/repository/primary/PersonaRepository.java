package com.ista.talento_humano.repository.primary;

import com.ista.talento_humano.model.primary.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<Persona, Long> {
public Persona findByCedula(String cedula);

}
