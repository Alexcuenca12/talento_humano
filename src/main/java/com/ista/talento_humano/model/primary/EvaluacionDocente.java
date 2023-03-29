package com.ista.talento_humano.model.primary;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class EvaluacionDocente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluacion")
    private Long id_evaluacion;
    
    @Column(name = "cod_carrera")
    private String codCarrera;
    
    @Column(name = "evidencia_evaluacion")
    private Byte[] EvidenciaEva;

	public Long getId_evaluacion() {
		return id_evaluacion;
	}

	public void setId_evaluacion(Long id_evaluacion) {
		this.id_evaluacion = id_evaluacion;
	}

	public String getCodCarrera() {
		return codCarrera;
	}

	public void setCodCarrera(String codCarrera) {
		this.codCarrera = codCarrera;
	}

	public Byte[] getEvidenciaEva() {
		return EvidenciaEva;
	}

	public void setEvidenciaEva(Byte[] evidenciaEva) {
		EvidenciaEva = evidenciaEva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    

}
