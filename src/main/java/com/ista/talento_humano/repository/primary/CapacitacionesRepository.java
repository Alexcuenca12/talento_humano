package com.ista.talento_humano.repository.primary;

import com.ista.talento_humano.model.primary.Capacitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CapacitacionesRepository extends JpaRepository<Capacitaciones, Long> {

    @Query(value = "SELECT * FROM capacitaciones WHERE id_persona = ?", nativeQuery = true)
    List<Capacitaciones> listarCapacitacionesPorPersona(@Param("idPersona") Long idPersona);

}
