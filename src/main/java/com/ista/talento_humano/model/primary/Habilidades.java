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
@Table(name = "habilidades")
public class Habilidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habilidades")
    private Long id_habilidades;
    @Column(name = "descripcion")
    private String Descripcion;
    
    /*Relacion con persona*/
	
    public Long getId_habilidades() {
		return id_habilidades;
	}
	public void setId_habilidades(Long id_habilidades) {
		this.id_habilidades = id_habilidades;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
