package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdoptanteRepository extends JpaRepository<Adoptante, Long>{
    
}
