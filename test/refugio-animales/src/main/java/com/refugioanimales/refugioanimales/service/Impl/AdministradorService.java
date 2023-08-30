/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refugioanimales.refugioanimales.service.Impl;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Administrador;
import com.refugioanimales.refugioanimales.repository.IAdministradorRepository;
import com.refugioanimales.refugioanimales.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService implements IAdministradorService {
    
    @Autowired
    private IAdministradorRepository administradorRepo;

    @Override
    public List<Administrador> getAdministradores() {
        List<Administrador> listaAdministrador = administradorRepo.findAll();
        return listaAdministrador;
    }

    @Override
    public void saveAdministrador(Administrador administrador) {
        administradorRepo.save(administrador);
    }

    @Override
    public void deleteAdministrador(Long id) {
        administradorRepo.deleteById(id);
    }

    @Override
    public void editAdministrador(Administrador administrador) {
        this.saveAdministrador(administrador);
    }

    @Override
    public Administrador getAdministrador(Long id) {
      Administrador administrador =  administradorRepo.findById(id).orElse(null);
        return administrador;
    }


    
}
