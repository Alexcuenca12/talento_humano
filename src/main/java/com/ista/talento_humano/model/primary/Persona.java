package com.ista.talento_humano.model.primary;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long id_persona;
	
	@Column(name = "ci_pasaporte")
	private Integer ci_pasaporte;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "pais_nacimiento")
	private String pais_nacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "estado_civil")
	private String estado_civil;
	
	@Column(name = "etnia")
	private String etnia;
	
	@Column(name = "tipo_sangre")
	private String tipo_sangre;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "correo_institucional")
	private String correo_institucional;
	
	@Column(name = "pais_residencia")
	private String pais_residencia;
	
	@Column(name = "parroquia_recidencial")
	private String parroquia_recidencial;
	
	@Column(name = "calle_principal")
	private String calle_principal;
	
	@Column(name = "calle_secundaria")
	private String calle_secundaria;
	
	@Column(name = "numero_casa")
	private Integer numero_casa;
	
	@Column(name = "sector")
	private String sector;
	
	@Column(name = "referencia")
	private String referencia;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "idioma_raiz")
	private String idioma_raiz;
	
	@Column(name = "idioma_secundario")
	private String idioma_secundario;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "discapacidad")
	private String discapasidad;
	
	@Column(name = "tipo_discapacidad")
	private String tipo_discapacidad;
	
	@Column(name = "porcentaje_discapacidad")
	private String porcentaje_discapacidad;
	
	@Column(name = "carnet_conadis")
	private String carnet_conadis;
	
	@Column(name = "foto_carnet")
	private String foto_carnet;

	/*Revizar campos Fenix*/

	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private Contrato contrato;

	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private Usuario usuario;

	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private Horario horario;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Experiencia> experiencias;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Recomendaciones> recomendaciones;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<InstruccionFormal> instruccionFormal;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Capacitaciones> capacitaciones;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<CargaFamiliar> cargaFamiliar;

	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Habilidades> habilidades;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public Integer getCi_pasaporte() {
		return ci_pasaporte;
	}

	public void setCi_pasaporte(Integer ci_pasaporte) {
		this.ci_pasaporte = ci_pasaporte;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPais_nacimiento() {
		return pais_nacimiento;
	}

	public void setPais_nacimiento(String pais_nacimiento) {
		this.pais_nacimiento = pais_nacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public String getTipo_sangre() {
		return tipo_sangre;
	}

	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo_institucional() {
		return correo_institucional;
	}

	public void setCorreo_institucional(String correo_institucional) {
		this.correo_institucional = correo_institucional;
	}

	public String getPais_residencia() {
		return pais_residencia;
	}

	public void setPais_residencia(String pais_residencia) {
		this.pais_residencia = pais_residencia;
	}

	public String getParroquia_recidencial() {
		return parroquia_recidencial;
	}

	public void setParroquia_recidencial(String parroquia_recidencial) {
		this.parroquia_recidencial = parroquia_recidencial;
	}

	public String getCalle_principal() {
		return calle_principal;
	}

	public void setCalle_principal(String calle_principal) {
		this.calle_principal = calle_principal;
	}

	public String getCalle_secundaria() {
		return calle_secundaria;
	}

	public void setCalle_secundaria(String calle_secundaria) {
		this.calle_secundaria = calle_secundaria;
	}

	public Integer getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(Integer numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIdioma_raiz() {
		return idioma_raiz;
	}

	public void setIdioma_raiz(String idioma_raiz) {
		this.idioma_raiz = idioma_raiz;
	}

	public String getIdioma_secundario() {
		return idioma_secundario;
	}

	public void setIdioma_secundario(String idioma_secundario) {
		this.idioma_secundario = idioma_secundario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDiscapasidad() {
		return discapasidad;
	}

	public void setDiscapasidad(String discapasidad) {
		this.discapasidad = discapasidad;
	}

	public String getTipo_discapacidad() {
		return tipo_discapacidad;
	}

	public void setTipo_discapacidad(String tipo_discapacidad) {
		this.tipo_discapacidad = tipo_discapacidad;
	}

	public String getPorcentaje_discapacidad() {
		return porcentaje_discapacidad;
	}

	public void setPorcentaje_discapacidad(String porcentaje_discapacidad) {
		this.porcentaje_discapacidad = porcentaje_discapacidad;
	}

	public String getCarnet_conadis() {
		return carnet_conadis;
	}

	public void setCarnet_conadis(String carnet_conadis) {
		this.carnet_conadis = carnet_conadis;
	}

	public String getFoto_carnet() {
		return foto_carnet;
	}

	public void setFoto_carnet(String foto_carnet) {
		this.foto_carnet = foto_carnet;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Experiencia> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public List<Recomendaciones> getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(List<Recomendaciones> recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	public List<InstruccionFormal> getInstruccionFormal() {
		return instruccionFormal;
	}

	public void setInstruccionFormal(List<InstruccionFormal> instruccionFormal) {
		this.instruccionFormal = instruccionFormal;
	}

	public List<Capacitaciones> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Capacitaciones> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public List<CargaFamiliar> getCargaFamiliar() {
		return cargaFamiliar;
	}

	public void setCargaFamiliar(List<CargaFamiliar> cargaFamiliar) {
		this.cargaFamiliar = cargaFamiliar;
	}

	public List<Habilidades> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidades> habilidades) {
		this.habilidades = habilidades;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
