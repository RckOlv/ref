package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorRepository extends JpaRepository<Administrador, Long> {
    
}
