package com.refugioanimales.refugioanimales.model;

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
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_tipo;

    private String nombre;
    
    @OneToMany(mappedBy = "tipo")
    List<Animal> listaAnimal; 
    
    @OneToMany(mappedBy = "tipo")
    List<Raza> listaRaza;

}
