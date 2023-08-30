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
@Table(name = "evento")
public class Evento {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private String nombre;
    
    @OneToMany(mappedBy = "evento")
    List<Historial> listaHistorial;

}
