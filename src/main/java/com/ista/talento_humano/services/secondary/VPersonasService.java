package com.ista.talento_humano.services.secondary;

import com.ista.talento_humano.model.secondary.vpersonas;

import java.util.List;

public interface VPersonasService {

    List<vpersonas> findByCedulaFenix(String cedula);
}
