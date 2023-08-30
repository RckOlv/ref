package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historial")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historial;
    private LocalDate fechaRescate;
    private LocalDate fechaAdopcion;

    @ManyToOne
    @JoinColumn(name = "id_adoptante")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Adoptante adoptante;

    @OneToMany(mappedBy = "historial")
    List<Rescatista> listaRescatistas;

    @ManyToOne
    @JoinColumn(name = "id_administrador")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Evento evento;

}
