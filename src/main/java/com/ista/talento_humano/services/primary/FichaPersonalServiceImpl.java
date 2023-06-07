package com.ista.talento_humano.services.primary;

import com.ista.talento_humano.model.primary.FichaPersonal;
import com.ista.talento_humano.repository.primary.FichaPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class FichaPersonalServiceImpl extends GenericServiceImpl<FichaPersonal, Long> implements FichaPersonalService{
    @Autowired
    FichaPersonalRepository fichaPersonalRepository;

    @Override
    public CrudRepository<FichaPersonal, Long> getDao(){

        return fichaPersonalRepository;
    }

}
