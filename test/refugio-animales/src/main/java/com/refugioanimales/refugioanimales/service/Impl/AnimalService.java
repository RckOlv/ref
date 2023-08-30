package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Animal;
import com.refugioanimales.refugioanimales.repository.IAnimalRepository;
import com.refugioanimales.refugioanimales.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService {
    
    @Autowired
    private IAnimalRepository animalRepo;

    @Override
    public List<Animal> getAnimales() {
        List<Animal> listaAnimal = animalRepo.findAll();
        return listaAnimal;
    }

    @Override
    public void saveAnimal(Animal animal) {
        animalRepo.save(animal);
    }

    @Override
    public void deleteAnimal(Long id) {
        animalRepo.deleteById(id);
    }

    @Override
    public void editAnimal(Animal animal) {
        this.saveAnimal(animal);
    }

    @Override
    public Animal getAnimal(Long id) {
        Animal animal =  animalRepo.findById(id).orElse(null);
        return animal;
    }

}
