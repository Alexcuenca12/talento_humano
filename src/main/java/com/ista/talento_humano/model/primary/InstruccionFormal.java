package com.ista.talento_humano.model.primary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "instruccion_formal")
public class InstruccionFormal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instruccion")
    private Long id_instruccion;
    @Column(name = "nivel_instruccion")
    private String nivelInstruccion;
    @Column(name = "institucion_educativa")
    private String institucionEducativa;
    @Column(name = "titulo_obtenido")
    private String tituloObtenido;
    @Column(name = "No_RegistroSenescyt")
    private String num_SenecytRegistro;
    @Column(name = "tiempo_estudio")
    private Double tiempoEstudio;
    @Column(name = "anio_graduacion")
    private int anioGraduacion;
    @Column(name = "area_estudios")
    private String areaEstudios;
    @Column(name = "titulo")
    private Byte[] titulo;
    
    /*Agregar relacion con persona*/
    
    
    
    
    
	public Long getId_instruccion() {
		return id_instruccion;
	}
	public void setId_instruccion(Long id_instruccion) {
		this.id_instruccion = id_instruccion;
	}
	public String getNivelInstruccion() {
		return nivelInstruccion;
	}
	public void setNivelInstruccion(String nivelInstruccion) {
		this.nivelInstruccion = nivelInstruccion;
	}
	public String getInstitucionEducativa() {
		return institucionEducativa;
	}
	public void setInstitucionEducativa(String institucionEducativa) {
		this.institucionEducativa = institucionEducativa;
	}
	public String getTituloObtenido() {
		return tituloObtenido;
	}
	public void setTituloObtenido(String tituloObtenido) {
		this.tituloObtenido = tituloObtenido;
	}
	public String getNum_SenecytRegistro() {
		return num_SenecytRegistro;
	}
	public void setNum_SenecytRegistro(String num_SenecytRegistro) {
		this.num_SenecytRegistro = num_SenecytRegistro;
	}
	public Double getTiempoEstudio() {
		return tiempoEstudio;
	}
	public void setTiempoEstudio(Double tiempoEstudio) {
		this.tiempoEstudio = tiempoEstudio;
	}
	public int getAnioGraduacion() {
		return anioGraduacion;
	}
	public void setAnioGraduacion(int anioGraduacion) {
		this.anioGraduacion = anioGraduacion;
	}
	public String getAreaEstudios() {
		return areaEstudios;
	}
	public void setAreaEstudios(String areaEstudios) {
		this.areaEstudios = areaEstudios;
	}
	public Byte[] getTitulo() {
		return titulo;
	}
	public void setTitulo(Byte[] titulo) {
		this.titulo = titulo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    

    
    
}
