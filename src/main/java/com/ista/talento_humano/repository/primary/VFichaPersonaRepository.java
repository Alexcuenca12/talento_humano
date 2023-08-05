package com.ista.talento_humano.repository.primary;

import com.ista.talento_humano.model.primary.vfichapersona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VFichaPersonaRepository extends JpaRepository<vfichapersona,Long> {

    public List<vfichapersona> findByIdPersona(Long id);
}
