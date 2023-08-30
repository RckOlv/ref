package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Persona;
import com.refugioanimales.refugioanimales.repository.IPersonaRepository;
import com.refugioanimales.refugioanimales.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private IPersonaRepository personaRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersona = personaRepo.findAll();
        return listaPersona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }

    @Override
    public Persona getPersona(Long id) {
        Persona persona =  personaRepo.findById(id).orElse(null);
        return persona;
    }

}
