package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "raza")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_raza;
    private String nombre;


    @ManyToOne (cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Tipo tipo;

    @OneToMany(mappedBy = "raza")
    List<Animal> listaAnimales;

}
