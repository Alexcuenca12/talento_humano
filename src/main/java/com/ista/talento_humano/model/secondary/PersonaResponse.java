package com.ista.talento_humano.model.secondary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaResponse implements Serializable {
    private String nombres;
    private String apellidos;
    private String correo;
    private String celular;
    private String telefono;
    private String ca_area;
}
