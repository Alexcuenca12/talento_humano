package com.ista.talento_humano.services.secondary;

import com.ista.talento_humano.model.secondary.vpersonas;
import com.ista.talento_humano.repository.secondary.VPersonasRepository;
import com.ista.talento_humano.services.primary.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VPersonasServiceImpl extends GenericServiceImpl<vpersonas, String> implements VPersonasService{

    @Autowired
    VPersonasRepository vPersonasRepository;
    @Override
    public CrudRepository<vpersonas, String> getDao() {
        return vPersonasRepository;
    }



    public List<vpersonas> findByCedulaFenix(String cedula) {
        return vPersonasRepository.findByCedulaFenix(cedula);
    }


}

