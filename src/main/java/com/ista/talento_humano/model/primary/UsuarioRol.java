package com.ista.talento_humano.model.primary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
 @Setter
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;

}
