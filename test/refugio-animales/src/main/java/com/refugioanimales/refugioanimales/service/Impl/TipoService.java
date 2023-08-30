package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Tipo;
import com.refugioanimales.refugioanimales.repository.ITipoRepository;
import com.refugioanimales.refugioanimales.service.ITipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoService implements ITipoService {
    
    @Autowired
    private ITipoRepository tipoRepo;

    @Override
    public List<Tipo> getTipos() {
        List<Tipo> listaTipo = tipoRepo.findAll();
        return listaTipo;
    }

    @Override
    public void saveTipo(Tipo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void deleteTipo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public void editTipo(Tipo tipo) {
        this.saveTipo(tipo);
    }

    @Override
    public Tipo getTipo(Long id) {
        Tipo tipo = tipoRepo.findById(id).orElse(null);
        return tipo;
    }

}
