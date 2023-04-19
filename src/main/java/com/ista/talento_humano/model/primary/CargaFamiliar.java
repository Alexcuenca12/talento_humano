package com.ista.talento_humano.model.primary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

	//Relation
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;

	
	
	
	
	public Long getId_cargaFamiliar() {
		return id_cargaFamiliar;
	}

	public void setId_cargaFamiliar(Long id_cargaFamiliar) {
		this.id_cargaFamiliar = id_cargaFamiliar;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre_pariente() {
		return nombre_pariente;
	}

	public void setNombre_pariente(String nombre_pariente) {
		this.nombre_pariente = nombre_pariente;
	}

	public String getApellido_pariente() {
		return apellido_pariente;
	}

	public void setApellido_pariente(String apellido_pariente) {
		this.apellido_pariente = apellido_pariente;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public byte[] getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(byte[] evidencia) {
		this.evidencia = evidencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
