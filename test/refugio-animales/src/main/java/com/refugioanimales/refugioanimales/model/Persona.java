package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@Getter @Setter
@Table(name = "persona")
public class Persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String sexo;
    private String dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion, String telefono, String sexo, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.dni = dni;
    }
}
