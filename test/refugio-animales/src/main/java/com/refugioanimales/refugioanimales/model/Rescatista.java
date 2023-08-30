package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rescatista")
public class Rescatista extends Persona {

    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private Long id_rescatista;
    private String direccionTransito;

    @ManyToOne
    @JoinColumn(name = "id_historial")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Historial historial;

}
