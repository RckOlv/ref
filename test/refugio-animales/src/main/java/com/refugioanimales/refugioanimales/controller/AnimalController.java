package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Animal;
import com.refugioanimales.refugioanimales.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    
    @Autowired
    private IAnimalService animalService;
    
    @GetMapping("/animales/traer")
    public List<Animal> getAnimales(){
        List<Animal> listaAnimales = animalService.getAnimales();
        return listaAnimales;
    }
    
    @GetMapping("/animal/traer/{id}")
    public Animal getAnimal(@PathVariable Long id){
        Animal animal = animalService.getAnimal(id);
        return animal;
    }
    
    @PostMapping("/animal/crear")
    public void saveAnimal(@RequestBody Animal animal){
        animalService.saveAnimal(animal);
    }
    
    @PutMapping("/animal/editar")
    public void editAnimal(@RequestBody Animal animal){
        animalService.editAnimal(animal);
    }
    
    @DeleteMapping("/animal/borrar/{id}")
    public void deleteAnimal(@PathVariable Long id){
        animalService.deleteAnimal(id);
    }
    
}
