package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.Contrato;
import com.ista.talento_humano.repository.primary.ContratoRepository;

@Service
public class ContratoServiceImpl extends GenericServiceImpl<Contrato, Long> implements ContratoService{
	@Autowired
	ContratoRepository contratoRepository;
	@Override
	public CrudRepository<Contrato, Long> getDao() {
		
		return contratoRepository;
	}
	

}
