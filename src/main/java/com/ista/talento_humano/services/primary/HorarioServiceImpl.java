package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Horario;
import com.ista.talento_humano.repository.primary.HorarioRepository;

@Service
public class HorarioServiceImpl extends GenericServiceImpl<Horario, Long> implements HorarioService{
	@Autowired
	HorarioRepository horarioRepository;
	@Override
	public CrudRepository<Horario, Long> getDao() {
		
		return horarioRepository;
	}
	

}
