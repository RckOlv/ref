package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Estado;
import com.refugioanimales.refugioanimales.service.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {
    
    @Autowired
    private IEstadoService estadoService;
    
    @GetMapping("/estados/traer")
    public List<Estado> getEstados(){
        List<Estado> listaEstados = estadoService.getEstados();
        return listaEstados;
    }
    
    @GetMapping("/estado/traer/{id}")
    public Estado getEstado(@PathVariable Long id){
        Estado estado = estadoService.getEstado(id);
        return estado;
    }
    
    @PostMapping("/estado/crear")
    public void saveEstado(@RequestBody Estado estado){
        estadoService.saveEstado(estado);
    }
    
    @PutMapping("/estado/editar")
    public void editEstado(@RequestBody Estado estado){
        estadoService.editEstado(estado);
    }
    
    @DeleteMapping("/estado/borrar/{id}")
    public void deleteEstado(@PathVariable Long id){
        estadoService.deleteEstado(id);
    }
    
}
