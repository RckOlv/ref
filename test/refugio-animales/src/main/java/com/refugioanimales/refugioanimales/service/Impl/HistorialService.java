/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Historial;
import com.refugioanimales.refugioanimales.repository.IHistorialRepository;
import com.refugioanimales.refugioanimales.service.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialService implements IHistorialService {

    @Autowired
    private IHistorialRepository historialRepo;
    
    @Override
    public List<Historial> getHistoriales() {
        List<Historial> listaHistoriales = historialRepo.findAll();
        return listaHistoriales;
    }

    @Override
    public void saveHistorial(Historial historial) {
        historialRepo.save(historial);
    }

    @Override
    public void deleteHistorial(Long id) {
        historialRepo.deleteById(id);
    }

    @Override
    public void editHistorial(Historial historial) {
        this.saveHistorial(historial);
    }

    @Override
    public Historial getHistorial(Long id) {
        Historial historial = historialRepo.findById(id).orElse(null);
        return historial;
    }
    
}
