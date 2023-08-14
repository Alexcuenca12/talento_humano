package com.ista.talento_humano.services.primary;

import com.ista.talento_humano.model.primary.vfichapersona;
import com.ista.talento_humano.repository.primary.VFichaPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VFichaPersonaServiceImpl extends GenericServiceImpl<vfichapersona, Long> implements VFichaPersonaService {
    @Autowired
    VFichaPersonaRepository vFichaPersonaRepository;
    @Override
    public CrudRepository<vfichapersona, Long> getDao() {
        return vFichaPersonaRepository;
    }

    @Override
    public List<vfichapersona> buscarID(Long id) {
        return vFichaPersonaRepository.findByIdPersona(id);
    }
}

