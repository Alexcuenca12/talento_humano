package com.ista.talento_humano.model.primary;

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
@Table(name = "periodoacademico")
public class PeriodoAcademico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_periodoacademico")
	private Long id_periodoacademico;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;

	public Long getId_periodoacademico() {
		return id_periodoacademico;
	}

	public void setId_periodoacademico(Long id_periodoacademico) {
		this.id_periodoacademico = id_periodoacademico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	
}
