package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Adoptante;
import com.refugioanimales.refugioanimales.repository.IAdoptanteRepository;
import com.refugioanimales.refugioanimales.service.IAdoptanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptanteService implements IAdoptanteService {
    
    @Autowired
    private IAdoptanteRepository adoptanteRepo;

    @Override
    public List<Adoptante> getAdoptantes() {
        List<Adoptante> listaAdoptantes = adoptanteRepo.findAll();
        return listaAdoptantes;
    }

    @Override
    public void saveAdoptante(Adoptante adoptante) {
        adoptanteRepo.save(adoptante);
    }

    @Override
    public void deleteAdoptante(Long id) {
        adoptanteRepo.deleteById(id);
    }

    @Override
    public void editAdoptante(Adoptante adoptante) {
        this.saveAdoptante(adoptante);
    }

    @Override
    public Adoptante getAdoptante(Long id) {
        Adoptante adoptante = adoptanteRepo.findById(id).orElse(null);
        return adoptante;
    }
    
}
