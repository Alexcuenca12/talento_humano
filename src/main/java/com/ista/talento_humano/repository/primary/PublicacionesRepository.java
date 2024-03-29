package com.ista.talento_humano.repository.primary;

import com.ista.talento_humano.model.primary.Publicaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicacionesRepository extends JpaRepository<Publicaciones, Long> {
    @Query(value = "SELECT * FROM publicaciones WHERE id_persona = ?", nativeQuery = true)
    List<Publicaciones> listarPublicacionesPorPersona(@Param("idPersona") Long idPersona);
}
