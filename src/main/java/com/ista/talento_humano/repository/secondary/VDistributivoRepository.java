package com.ista.talento_humano.repository.secondary;

import com.ista.talento_humano.model.secondary.vdistributivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VDistributivoRepository extends JpaRepository<vdistributivo, String> {

    List<vdistributivo> findAll();
}
