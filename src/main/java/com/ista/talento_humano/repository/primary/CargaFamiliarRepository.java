package com.ista.talento_humano.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.talento_humano.model.primary.CargaFamiliar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CargaFamiliarRepository extends JpaRepository<CargaFamiliar, Long>{
    @Query(value = "SELECT * FROM carga_familiar WHERE id_persona = ?", nativeQuery = true)
    List<CargaFamiliar> listarCargaFamiliarPorPersona(@Param("idPersona") Long idPersona);
}
