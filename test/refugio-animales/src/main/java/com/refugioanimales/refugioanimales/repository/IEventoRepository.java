package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRepository  extends JpaRepository<Evento, Long>{
    
}
