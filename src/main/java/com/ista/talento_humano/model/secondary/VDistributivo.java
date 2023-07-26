package com.ista.talento_humano.model.secondary;

import javax.persistence.*;

import com.ista.talento_humano.model.primary.PeriodoAcademico;
import com.ista.talento_humano.model.primary.Persona;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "distributivo")
public class VDistributivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_distributivo")
	private Long id_distributivo;
	
	@Column(name = "nombres")
	private Integer nombres;
	
	@Column(name = "apellidos")
	private Integer apellidos;
	
	@Column(name = "dedicacion")
	private Integer dedicacion;
	
	@Column(name = "cod_carrera")
	private Integer cod_carrera;
	
	@Column(name = "materia")
	private Integer materia;
	
	@Column(name = "paralelo")
	private Integer paralelo;
	
	@Column(name = "evidencia")
	private Integer evidencia;

	//Relation
	/*@OneToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;

	@OneToOne
	@JoinColumn(name = "id_periodoacademico")
	private PeriodoAcademico periodo;*/
}
