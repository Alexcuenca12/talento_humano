package com.ista.talento_humano.services.primary;

import com.ista.talento_humano.model.primary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MiServicio {

    private final PersonaService personaService;
    private final CapacitacionesService capacitacionesService;
    private final CargaFamiliarService cargaFamiliarService;
    private final ContratoService contratoService;
    private final EvaluacionDocenteService evaluacionService;
    private final HabilidadesService habilidadesService;
    private final HorarioService horarioService;
    private final PublicacionesService publicacionesService;
    private final RecomendacionesService recomendacionesService;

    @Autowired
    public MiServicio(
            PersonaService personaService,
            CapacitacionesService capacitacionesService,
            CargaFamiliarService cargaFamiliarService,
            ContratoService contratoService,
            EvaluacionDocenteService evaluacionService,
            HabilidadesService habilidadesService,
            HorarioService horarioService,
            PublicacionesService publicacionesService,
            RecomendacionesService recomendacionesService) {
        this.personaService = personaService;
        this.capacitacionesService = capacitacionesService;
        this.cargaFamiliarService = cargaFamiliarService;
        this.contratoService = contratoService;
        this.evaluacionService = evaluacionService;
        this.habilidadesService = habilidadesService;
        this.horarioService = horarioService;
        this.publicacionesService = publicacionesService;
        this.recomendacionesService = recomendacionesService;
    }

    public FichaCombinada obtenerInformacionCompleta(Long id) {
        Persona persona = personaService.findById(id);
        List<Capacitaciones> capacitaciones = personaService.listarCapacitacionesPorPersona(id);
        List<CargaFamiliar> cargaFamiliar = personaService.listarCargaFamiliarPorPersona(id);
        List<Contrato> contratos = personaService.listarContratosPorPersona(id);
        List<EvaluacionDocente> evaluaciones = personaService.listarEvaluacionesPorPersona(id);
        List<Habilidades> habilidades = personaService.listarHabilidadesPorPersona(id);
        List<Horario> horarios = personaService.listarHorariosPorPersona(id);
        List<Publicaciones> publicaciones = personaService.listarPublicacionesPorPersona(id);
        List<Recomendaciones> recomendaciones = personaService.listarRecomendacionesPorPersona(id);

        return new FichaCombinada(
                persona,
                capacitaciones,
                cargaFamiliar,
                contratos,
                evaluaciones,
                habilidades,
                horarios,
                publicaciones,
                recomendaciones
        );
    }

    public Persona guardarPersona(Persona persona) {
        return personaService.save(persona);
    }

    public List<Persona> obtenerTodasLasPersonas() {
        return personaService.findByAll();
    }

    // Agregar otros métodos para guardar y obtener información en los servicios correspondientes
}