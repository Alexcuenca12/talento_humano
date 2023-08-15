package com.ista.talento_humano.services.primary;

import com.ista.talento_humano.model.primary.*;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface PersonaService extends GenericService<Persona, Long> {

    List<Capacitaciones> listarCapacitacionesPorPersona(Long idPersona);


    List<CargaFamiliar> listarCargaFamiliarPorPersona(Long idPersona);


    List<Contrato> listarContratosPorPersona(Long idPersona);


    List<EvaluacionDocente> listarEvaluacionesPorPersona(Long idPersona);


    List<Habilidades> listarHabilidadesPorPersona(Long idPersona);


    List<Horario> listarHorariosPorPersona(Long idPersona);


    List<Publicaciones> listarPublicacionesPorPersona(Long idPersona);


    List<Recomendaciones> listarRecomendacionesPorPersona(Long idPersona);

    List<Experiencia> listarExperienciaPorPersona(Long idPersona);

    List<InstruccionFormal> listarInstruccionFormalPorPersona(Long idPersona);

}
