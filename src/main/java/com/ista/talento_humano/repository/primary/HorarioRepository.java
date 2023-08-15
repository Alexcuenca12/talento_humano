package com.ista.talento_humano.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.talento_humano.model.primary.Horario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario, Long>{
    @Query(value = "SELECT * FROM horario WHERE id_persona = ?", nativeQuery = true)
    List<Horario> listarHorariosPorPersona(@Param("idPersona") Long idPersona);
}
