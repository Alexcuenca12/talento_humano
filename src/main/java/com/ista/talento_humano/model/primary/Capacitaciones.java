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
@Table(name = "capacitaciones")
public class Capacitaciones implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_capacitaciones")
	private Long id_capacitaciones;
	
	@Column(name = "institucion")
	private String institucion;
	
	@Column(name = "tipo_evento")
	private String tipo_evento;
	
	@Column(name = "nombre_evento")
	private String nombre_evento;
	
	@Column(name = "area_estudios")
	private Integer area_estudios;
	
	@Column(name = "tipo_certiicado")
	private String tipo_certiicado;
	
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	
	@Column(name = "numero_dias")
	private Integer numero_dias;
	
	@Column(name = "cantidad_horas")
	private Integer cantidad_horas;
	
	@Column(name = "evidencia")
	private byte[] evidencia;
	
	//Relation
	@Column(name = "id_persona")
	private String id_persona;
	
}
