package com.ista.talento_humano.model.primary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "contrato")
public class Contrato implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cargaFamiliar")
	private Long id_cargaFamiliar;
	
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	
	@Column(name = "anio_duracion")
	private Integer anio_duracion;
	
	@Column(name = "horas_diarias")
	private Integer horas_diarias;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "salario")
	private Double salario;
	
	@Column(name = "evidencia")
	private byte[] evidencia;
	
	//Relation
	@JoinColumn(name="id_persona")
	private Persona persona;


	
	
	
}
