package com.ista.talento_humano.model.primary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "experiencia")
public class Experiencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_experiencia")
	private Long id_experiencia;
	
	@Column(name = "institucion")
	private String institucion;
	
	@Column(name = "puesto")
	private String puesto;
	
	@Column(name = "area_trabajo")
	private String area_trabajo;
	
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	
	@Column(name = "actividades")
	private String actividades;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "certificado_trabajo")
	private byte[] certificado_trabajo;
	
	//Relation
	@Column(name = "id_persona")
	private Integer id_persona;
	
}
