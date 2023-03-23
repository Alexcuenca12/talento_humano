package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Recomendaciones;
import com.ista.talento_humano.repository.primary.RecomedacionesRepository;

@Service
public class RecomendacionesServiceImpl extends GenericServiceImpl<Recomendaciones, Long> implements RecomendacionesService{
	@Autowired
	RecomedacionesRepository recomedacionesRepository;
	@Override
	public CrudRepository<Recomendaciones, Long> getDao() {
		
		return recomedacionesRepository;
	}
	

}
