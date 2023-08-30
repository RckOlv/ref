package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Estado;

import java.util.List;


public interface IEstadoService {
    
    public List<Estado> getEstados();

    public void saveEstado(Estado estado);

    public void deleteEstado(Long id);

    public void editEstado(Estado estado);

    public Estado getEstado(Long id);
    
}
