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
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_animal;
    private Double peso;
    private boolean estaCastrado;
    private String tamañoEsperado;

    @OneToMany(mappedBy = "animal")
    List<Historial> listaHistorial;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_raza")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Raza raza;

}
