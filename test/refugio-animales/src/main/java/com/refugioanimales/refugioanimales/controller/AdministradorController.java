package com.refugioanimales.refugioanimales.controller;


import com.refugioanimales.refugioanimales.model.Administrador;
import com.refugioanimales.refugioanimales.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministradorController {
    
    @Autowired
    private IAdministradorService administradorService;
    
    @GetMapping("/administradores/traer")
    public List<Administrador> getAdministradores(){
        List<Administrador> listaAdministradores = administradorService.getAdministradores();
        return listaAdministradores;
    }
    
    @GetMapping("/administrador/traer/{id}")
    public Administrador getAdministrador(@PathVariable Long id){
        Administrador administrador = administradorService.getAdministrador(id);
        return administrador;
    }
    
    @PostMapping("/administrador/crear")
    public void saveAdministrador(@RequestBody Administrador administrador){
        administradorService.saveAdministrador(administrador);
    }
    
    @PutMapping("/administrador/editar")
    public void editAdministrador(@RequestBody Administrador administrador){
        administradorService.editAdministrador(administrador);
    }
    
    @DeleteMapping("/administrador/borrar/{id}")
    public void deleteAdministrador(@PathVariable Long id){
        administradorService.deleteAdministrador(id);
    }
    
}
