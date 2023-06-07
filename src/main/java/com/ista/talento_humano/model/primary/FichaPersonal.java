package com.ista.talento_humano.model.primary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ficha_personal")
public class FichaPersonal {
    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha")
    private Long id_ficha;

    //porcentaje_completo
    @Column(name = "porcentaje_completo")
    private int porcentaje_completo;

    //estado
    @Column(name = "estado_ficha")
    private Boolean estado_ficha;

    //Relaciones
    @ManyToOne
    @JoinColumn(name="capacitaciones")
    private Capacitaciones capacitaciones;

    @ManyToOne
    @JoinColumn(name="carga_familiar")
    private CargaFamiliar cargaFamiliar;

    @OneToOne
    @JoinColumn(name="contrato")
    private Contrato contrato;

    @OneToOne
    @JoinColumn(name="evaluacion")
    private EvaluacionDocente evaluacionDocente;

    @ManyToOne
    @JoinColumn(name="experiencia")
    private Experiencia experiencia;

    @ManyToOne
    @JoinColumn(name="habilidades")
    private Habilidades habilidades;

    @OneToOne
    @JoinColumn(name="horario")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name="instruccion")
    private InstruccionFormal instruccionFormal;

    @OneToOne
    @JoinColumn(name="periodo")
    private PeriodoAcademico periodoAcademico;

    @OneToOne
    @JoinColumn(name="persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name="recomendaciones")
    private Recomendaciones recomendaciones;

}
