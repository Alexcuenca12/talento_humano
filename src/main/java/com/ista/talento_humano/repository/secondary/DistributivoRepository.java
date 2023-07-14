package com.ista.talento_humano.repository.secondary;

import com.ista.talento_humano.model.secondary.Distributivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistributivoRepository extends JpaRepository<Distributivo, String> {

    List<Distributivo> findAll();
}
