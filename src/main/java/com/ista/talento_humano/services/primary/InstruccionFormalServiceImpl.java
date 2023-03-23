package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.InstruccionFormal;
import com.ista.talento_humano.repository.primary.InstruccionFormalRepository;

@Service
public class InstruccionFormalServiceImpl extends GenericServiceImpl<InstruccionFormal, Long> implements InstruccionFormalService{
	@Autowired
	InstruccionFormalRepository instruccionFormalRepository;

	@Override
	public CrudRepository<InstruccionFormal, Long> getDao() {
		
		return instruccionFormalRepository;
	}

}
