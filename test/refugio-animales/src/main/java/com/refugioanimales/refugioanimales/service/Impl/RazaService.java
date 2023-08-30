package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Raza;
import com.refugioanimales.refugioanimales.repository.IRazaRepository;
import com.refugioanimales.refugioanimales.service.IRazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RazaService implements IRazaService {
    
    @Autowired
    private IRazaRepository razaRepo;

    @Override
    public List<Raza> getRazas() {
        List<Raza> listaRaza = razaRepo.findAll();
        return listaRaza;
    }

    @Override
    public void saveRaza(Raza raza) {
        razaRepo.save(raza);
    }

    @Override
    public void deleteRaza(Long id) {
        razaRepo.deleteById(id);
    }

    @Override
    public void editRaza(Raza raza) {
        this.saveRaza(raza);
    }

    @Override
    public Raza getRaza(Long id) {
        Raza raza = razaRepo.findById(id).orElse(null);
        return raza;
    }

}
