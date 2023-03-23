package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Habilidades;
import com.ista.talento_humano.repository.primary.HabilidadesRepository;

@Service
public class HabilidadesServiceImpl extends GenericServiceImpl<Habilidades, Long> implements HabilidadesService{
	@Autowired
	HabilidadesRepository habilidadesRepository;
	@Override
	public CrudRepository<Habilidades, Long> getDao() {
		
		return habilidadesRepository;
	}
}
