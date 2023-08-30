package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoRepository extends JpaRepository<Tipo, Long>{
    
}
