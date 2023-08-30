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
@Table(name = "estado")
public class Estado {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_estado;
    private String nombre;
    
    @OneToMany(mappedBy = "estado")
    List<Historial> listaHistorial;

}
