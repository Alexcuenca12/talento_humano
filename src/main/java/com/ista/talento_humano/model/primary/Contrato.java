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

	public Long getId_cargaFamiliar() {
		return id_cargaFamiliar;
	}

	public void setId_cargaFamiliar(Long id_cargaFamiliar) {
		this.id_cargaFamiliar = id_cargaFamiliar;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Integer getAnio_duracion() {
		return anio_duracion;
	}

	public void setAnio_duracion(Integer anio_duracion) {
		this.anio_duracion = anio_duracion;
	}

	public Integer getHoras_diarias() {
		return horas_diarias;
	}

	public void setHoras_diarias(Integer horas_diarias) {
		this.horas_diarias = horas_diarias;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
