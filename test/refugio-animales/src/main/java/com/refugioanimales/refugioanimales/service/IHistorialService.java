/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Historial;

import java.util.List;

public interface IHistorialService {

    public List<Historial> getHistoriales();

    public void saveHistorial(Historial historial);

    public void deleteHistorial(Long id);

    public void editHistorial(Historial historial);

    public Historial getHistorial(Long id);

}
