package com.ista.talento_humano.services.primary;

import com.ista.talento_humano.model.primary.Publicaciones;
import com.ista.talento_humano.repository.primary.PublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PublicacionesServiceImpl extends GenericServiceImpl<Publicaciones, Long> implements PublicacionesService {

    @Autowired
    PublicacionesRepository publicacionesRepository;

    @Override
    public CrudRepository<Publicaciones, Long> getDao() {
        return publicacionesRepository;
    }
}
