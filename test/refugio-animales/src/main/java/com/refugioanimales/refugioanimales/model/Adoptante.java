package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adoptante")
public class Adoptante extends Persona {

    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // private Long id_adoptante;

    @OneToMany(mappedBy = "adoptante")
    private List<Historial> listaHistorial;

}
