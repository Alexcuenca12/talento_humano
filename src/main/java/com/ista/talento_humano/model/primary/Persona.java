package com.ista.talento_humano.model.primary;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long id_persona;
	
	@Column(name = "ci_pasaporte")
	private Integer ci_pasaporte;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "pais_nacimiento")
	private String pais_nacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "estado_civil")
	private String estado_civil;
	
	@Column(name = "etnia")
	private String etnia;
	
	@Column(name = "tipo_sangre")
	private String tipo_sangre;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "correo_institucional")
	private String correo_institucional;
	
	@Column(name = "pais_residencia")
	private String pais_residencia;
	
	@Column(name = "parroquia_recidencial")
	private String parroquia_recidencial;
	
	@Column(name = "calle_principal")
	private String calle_principal;
	
	@Column(name = "calle_secundaria")
	private String calle_secundaria;
	
	@Column(name = "numero_casa")
	private Integer numero_casa;
	
	@Column(name = "sector")
	private String sector;
	
	@Column(name = "referencia")
	private String referencia;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "idioma_raiz")
	private String idioma_raiz;
	
	@Column(name = "idioma_secundario")
	private String idioma_secundario;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "discapacidad")
	private String discapasidad;
	
	@Column(name = "tipo_discapacidad")
	private String tipo_discapacidad;
	
	@Column(name = "porcentaje_discapacidad")
	private String porcentaje_discapacidad;
	
	@Column(name = "carnet_conadis")
	private String carnet_conadis;
	
	@Column(name = "foto_carnet")
	private String foto_carnet;

	/*Revizar campos Fenix*/

	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private Contrato contrato;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Experiencia> experiencias;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Recomendaciones> recomendaciones;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<InstruccionFormal> instruccionFormal;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Capacitaciones> capacitaciones;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<CargaFamiliar> cargaFamiliar;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Habilidades> habilidades;

	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private Usuario usuario;
}
