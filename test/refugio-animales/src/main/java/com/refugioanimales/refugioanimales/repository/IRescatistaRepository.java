package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Rescatista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRescatistaRepository extends JpaRepository<Rescatista, Long>{
    
}
