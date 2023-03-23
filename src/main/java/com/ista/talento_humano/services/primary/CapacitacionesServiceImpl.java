package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Capacitaciones;
import com.ista.talento_humano.repository.primary.CapacitacionesRepository;

@Service
public class CapacitacionesServiceImpl extends GenericServiceImpl<Capacitaciones, Long> implements CapacitacionesService{
	@Autowired
	CapacitacionesRepository capacitacionesRepository;
	@Override
	public CrudRepository<Capacitaciones, Long> getDao() {
		return capacitacionesRepository;
	}
	

}
