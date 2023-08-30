package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Raza;
import com.refugioanimales.refugioanimales.service.IRazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RazaController {
    
    @Autowired
    private IRazaService razaService;
    
    @GetMapping("/razas/traer")
    public List<Raza> getRazas(){
        List<Raza> listaRazas = razaService.getRazas();
        return listaRazas;
    }
    
    @GetMapping("/raza/traer/{id}")
    public Raza getRaza(@PathVariable Long id){
        Raza raza = razaService.getRaza(id);
        return raza;
    }
    
    @PostMapping("/raza/crear")
    public void saveRaza(@RequestBody Raza raza){
        razaService.saveRaza(raza);
    }
    
    @PutMapping("/raza/editar")
    public void editRaza(@RequestBody Raza raza){
        razaService.editRaza(raza);
    }
    
    @DeleteMapping("/raza/borrar/{id}")
    public void deleteRaza(@PathVariable Long id){
        razaService.deleteRaza(id);
    }
    
}
