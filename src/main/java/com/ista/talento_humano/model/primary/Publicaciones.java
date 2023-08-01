package com.ista.talento_humano.model.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "publicaciones")
public class Publicaciones {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publi")
    private Long id_publi;

    @Column(name = "titulo_publi")
    private String titulo_publi;

    @Column(name = "fecha_publi")
    private Date fecha_publi;

    @Column(name = "publicacion", columnDefinition = "LONGTEXT")
    private String publicacion;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
}
