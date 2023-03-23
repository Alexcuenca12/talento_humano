package com.ista.talento_humano.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;      
import com.ista.talento_humano.model.primary.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {
	
}
