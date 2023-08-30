package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Animal;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimalRepository extends JpaRepositoryImplementation<Animal, Long>{
    
}
