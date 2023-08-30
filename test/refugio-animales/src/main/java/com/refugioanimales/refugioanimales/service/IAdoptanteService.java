/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Adoptante;

import java.util.List;


public interface IAdoptanteService {
    
    public List<Adoptante> getAdoptantes();

    public void saveAdoptante(Adoptante adoptante);

    public void deleteAdoptante(Long id);

    public void editAdoptante(Adoptante adoptante);

    public Adoptante getAdoptante(Long id);
    
}


