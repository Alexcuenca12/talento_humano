package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.EvaluacionDocente;
import com.ista.talento_humano.repository.primary.EvaluacionDocenteRepository;

@Service
public class EvaluacionDocenteServiceImpl extends GenericServiceImpl<EvaluacionDocente, Long> implements EvaluacionDocenteService{
	@Autowired
	EvaluacionDocenteRepository EvaluacionDocenteRepository;
	@Override
	public CrudRepository<EvaluacionDocente, Long> getDao() {
		return EvaluacionDocenteRepository;
	}
	
}
