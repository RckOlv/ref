package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
