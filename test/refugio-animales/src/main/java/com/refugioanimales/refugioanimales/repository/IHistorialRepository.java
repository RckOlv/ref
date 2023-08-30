package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistorialRepository extends JpaRepository<Historial, Long>{
    
}
