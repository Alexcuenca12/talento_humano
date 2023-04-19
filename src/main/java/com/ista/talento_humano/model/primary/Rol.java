package com.ista.talento_humano.model.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rol")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id_rol;
    @Column(name = "nombreRol")
    private String nombreRol;
    @Column(name = "descripcionRol")
    private String descripcionRol;

    /*Agregar relacion con Usuario*/
    @JsonIgnore
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuario;
}
