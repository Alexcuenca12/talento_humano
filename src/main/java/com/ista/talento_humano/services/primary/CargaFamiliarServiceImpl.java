package com.ista.talento_humano.services.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.talento_humano.model.primary.CargaFamiliar;
import com.ista.talento_humano.repository.primary.CargaFamiliarRepository;

@Service
public class CargaFamiliarServiceImpl extends GenericServiceImpl<CargaFamiliar, Long> implements CargaFamiliarService{
	@Autowired
	CargaFamiliarRepository cargaFamiliarRepository;
	@Override
	public CrudRepository<CargaFamiliar, Long> getDao() {
		
		return cargaFamiliarRepository;
	}

}
