package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Raza;

import java.util.List;

public interface IRazaService {
    
    public List<Raza> getRazas();

    public void saveRaza(Raza raza);

    public void deleteRaza(Long id);

    public void editRaza(Raza raza);

    public Raza getRaza(Long id);
    
}
