package com.ista.talento_humano.model.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "horario")
public class Horario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_horario;

    private String periodo;

    private String horario;

    private String dias;

    @Column(length = 10485760)
    private String distributivo;


    //Relation
    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private PeriodoAcademico periodoAc;

    @JsonIgnore
    @OneToOne(mappedBy = "horario")
    private FichaPersonal fichaPersonal;

}
