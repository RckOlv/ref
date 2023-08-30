package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Historial;
import com.refugioanimales.refugioanimales.service.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistorialController {
    
    @Autowired
    private IHistorialService historialService;
    
    @GetMapping("/historiales/traer")
    public List<Historial> getHistoriales(){
        List<Historial> listaHistoriales = historialService.getHistoriales();
        return listaHistoriales;
    }
    
    @PostMapping("/historial/crear")
    public void saveHistorial(@RequestBody Historial historial){
        historialService.saveHistorial(historial);
    }
    
    @PutMapping("/historial/editar")
    public void editHistorial(@RequestBody Historial historial){
        historialService.editHistorial(historial);
    }
    
    @DeleteMapping("/historial/borrar/{id}")
    public void deleteHistorial(@PathVariable Long id){
        historialService.deleteHistorial(id);
    }
    
    @GetMapping("/historial/traer/{id}")
    public Historial getHistorial(@PathVariable Long id){
        Historial historial = historialService.getHistorial(id);
        return historial;
    }
}
