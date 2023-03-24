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

	
	//Getters y Setter (es solo por mi maquina que no lee lombook)
	// despues borramos todos esto, cuando ya haya formateado mi pc jajaja
	public Long getId_capacitaciones() {
		return id_capacitaciones;
	}

	public void setId_capacitaciones(Long id_capacitaciones) {
		this.id_capacitaciones = id_capacitaciones;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public Integer getArea_estudios() {
		return area_estudios;
	}

	public void setArea_estudios(Integer area_estudios) {
		this.area_estudios = area_estudios;
	}

	public String getTipo_certiicado() {
		return tipo_certiicado;
	}

	public void setTipo_certiicado(String tipo_certiicado) {
		this.tipo_certiicado = tipo_certiicado;
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

	public Integer getNumero_dias() {
		return numero_dias;
	}

	public void setNumero_dias(Integer numero_dias) {
		this.numero_dias = numero_dias;
	}

	public Integer getCantidad_horas() {
		return cantidad_horas;
	}

	public void setCantidad_horas(Integer cantidad_horas) {
		this.cantidad_horas = cantidad_horas;
	}

	public byte[] getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(byte[] evidencia) {
		this.evidencia = evidencia;
	}

	public String getId_persona() {
		return id_persona;
	}

	public void setId_persona(String id_persona) {
		this.id_persona = id_persona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
