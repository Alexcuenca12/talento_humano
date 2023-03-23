package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Persona;
import com.ista.talento_humano.repository.primary.PersonaRepository;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{
	@Autowired
	PersonaRepository personaRepository;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		
		return personaRepository;
	}

}
