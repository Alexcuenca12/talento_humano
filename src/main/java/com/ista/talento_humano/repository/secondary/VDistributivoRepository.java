package com.ista.talento_humano.repository.secondary;

import com.ista.talento_humano.model.secondary.VDistributivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VDistributivoRepository extends JpaRepository<VDistributivo, String> {

    List<VDistributivo> findAll();
}
