package com.ista.talento_humano.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.talento_humano.model.primary.InstruccionFormal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InstruccionFormalRepository extends JpaRepository<InstruccionFormal, Long>{
    @Query(value = "SELECT * FROM instruccion_formal WHERE id_persona = ?", nativeQuery = true)
    List<InstruccionFormal> listarInstruccionFormalPorPersona(@Param("idPersona") Long idPersona);
}
