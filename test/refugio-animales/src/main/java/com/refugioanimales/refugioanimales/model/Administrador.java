package com.refugioanimales.refugioanimales.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "administrador")
public class Administrador extends Persona {

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private Long id_administrador;
    private String usuario;
    private String clave;
    
    @OneToMany(mappedBy = "administrador")
    private List<Historial> listaHistorial;

}
