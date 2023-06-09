package com.ista.talento_humano.model.primary;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ista.talento_humano.model.secondary.Distributivo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

	@OneToOne(mappedBy = "periodo",cascade = CascadeType.ALL)
	@JsonIgnore
	private Distributivo distributivo;

	@OneToMany(mappedBy = "periodoAc",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Horario> horarios;

	@OneToMany(mappedBy = "periodoAc",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<EvaluacionDocente> evaluaciones;

	@JsonIgnore
	@OneToOne(mappedBy = "periodoAcademico")
	private FichaPersonal fichaPersonal;

}
