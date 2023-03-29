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

	
	
	
	
	public Long getId_experiencia() {
		return id_experiencia;
	}

	public void setId_experiencia(Long id_experiencia) {
		this.id_experiencia = id_experiencia;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getArea_trabajo() {
		return area_trabajo;
	}

	public void setArea_trabajo(String area_trabajo) {
		this.area_trabajo = area_trabajo;
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

	public String getActividades() {
		return actividades;
	}

	public void setActividades(String actividades) {
		this.actividades = actividades;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public byte[] getCertificado_trabajo() {
		return certificado_trabajo;
	}

	public void setCertificado_trabajo(byte[] certificado_trabajo) {
		this.certificado_trabajo = certificado_trabajo;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
