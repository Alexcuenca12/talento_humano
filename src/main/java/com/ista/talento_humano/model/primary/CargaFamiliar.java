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
@Table(name = "carga_familiar")
public class CargaFamiliar implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cargaFamiliar")
	private Long id_cargaFamiliar;
	
	@Column(name = "cedula")
	private String cedula;
	
	@Column(name = "nombre_pariente")
	private String nombre_pariente;
	
	@Column(name = "apellido_pariente")
	private String apellido_pariente;
	
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "evidencia")
	private byte[] evidencia;
}
