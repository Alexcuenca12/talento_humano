package com.ista.talento_humano.model.primary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "vfichapersona")
public class vfichapersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;
    private String persona_correo;
    private String persona_nombres;
    private String persona_apellidos;
    private int persona_cedula;
    private String persona_correo_institucional;
    private String persona_genero;
    private String capa_area_estudios;
    private int capa_horas;
    @Column(columnDefinition = "LONGTEXT")
    private String capa_evidencia;
    private Date capa_ficha_fin;
    private Date capa_fecha_inicio;
    private String capa_institucion;
    private String capa_nombre_evento;
    private int capa_num_dias;
    private String capa_tipo_certificado;
    private String capa_tipo_evento;
    private String carga_apellido;
    private String carga_cedula;
    private int carga_edad;
    @Column(columnDefinition = "LONGTEXT")
    private String carga_evidencia;
    private Date carga_fecha_nac;
    private String carga_nombre;
    private int con_anio_duracion;
    private String con_cargo;
    @Column(columnDefinition = "LONGTEXT")
    private String con_evidencia;
    private Date con_fecha_fin;
    private Date con_fecha_inicio;
    private int con_horas;
    private Double con_salario;
    @Column(columnDefinition = "LONGTEXT")
    private String eva_evidencia;
    private String eva_cod_carrera;
    private String hab_descripcion;
    private String ho_dias;
    @Column(columnDefinition = "LONGTEXT")
    private String ho_distributivo;
    private String ho_horario;
    private String ho_periodo;
    private Date publi_fecha;
    @Column(columnDefinition = "LONGTEXT")
    private String publi_evidencia;
    private String publi_titulo;
    private String reco_correo;
    @Column(columnDefinition = "LONGTEXT")
    private String reco_documento;
    private String reco_primer_apell;
    private String reco_primer_nom;
    private String reco_segundo_apell;
    private String reco_segundo_nom;
}
