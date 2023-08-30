package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Persona;

import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersonas();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public void editPersona(Persona persona);

    public Persona getPersona(Long id);
    
}
