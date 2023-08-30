package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Persona;
import com.refugioanimales.refugioanimales.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = personaService.getPersonas();
        return listaPersonas;
    }
    
    @GetMapping("/persona/traer/{id}")
    public Persona getPersona(@PathVariable Long id){
        Persona persona = personaService.getPersona(id);
        return persona;
    }
    
    @PostMapping("/persona/crear")
    public void savePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
    }
    
    @PutMapping("/persona/editar")
    public void editPersona(@RequestBody Persona persona){
        personaService.editPersona(persona);
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
    }
    
}
