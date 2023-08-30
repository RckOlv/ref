package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Evento;

import java.util.List;


public interface IEventoService {
    
    public List<Evento> getEventos();

    public void saveEvento(Evento evento);

    public void deleteEvento(Long id);

    public void editEvento(Evento evento);

    public Evento getEvento(Long id);
    
}
