package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Evento;
import com.refugioanimales.refugioanimales.repository.IEventoRepository;
import com.refugioanimales.refugioanimales.service.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEventoService {
    
    @Autowired
    private IEventoRepository eventoRepo;

    @Override
    public List<Evento> getEventos() {
        List<Evento> listaEvento = eventoRepo.findAll();
        return listaEvento;
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepo.save(evento);
    }

    @Override
    public void deleteEvento(Long id) {
       eventoRepo.deleteById(id);
    }

    @Override
    public void editEvento(Evento evento) {
        this.saveEvento(evento);
    }

    @Override
    public Evento getEvento(Long id) {
        Evento evento =  eventoRepo.findById(id).orElse(null);
        return evento;
    }

}
