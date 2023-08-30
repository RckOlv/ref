package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Long>{
    
}
