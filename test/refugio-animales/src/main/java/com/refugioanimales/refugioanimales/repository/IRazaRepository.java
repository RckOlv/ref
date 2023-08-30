package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Raza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRazaRepository extends JpaRepository<Raza, Long>{
    
}
