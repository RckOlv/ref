package com.refugioanimales.refugioanimales.controller;

import java.util.List;

import com.refugioanimales.refugioanimales.model.Rescatista;
import com.refugioanimales.refugioanimales.service.IRescatistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RescatistaController {
    
    @Autowired
    private IRescatistaService rescatistaService;
    
    @GetMapping("/rescatistas/traer")
    public List<Rescatista> getRescatistas(){
        List<Rescatista> listaRescatistas = rescatistaService.getRescatistas();
        return listaRescatistas;
    }
    
    @GetMapping("/rescatista/traer/{id}")
    public Rescatista getRescatista(@PathVariable Long id){
        Rescatista rescatista = rescatistaService.getRescatista(id);
        return rescatista;
    }
    
    @PostMapping("/rescatista/crear")
    public void saveRescatista(@RequestBody Rescatista rescatista){
        rescatistaService.saveRescatista(rescatista);
    }
    
    @PutMapping("/rescatista/editar")
    public void editRescatista(@RequestBody Rescatista rescatista){
        rescatistaService.editRescatista(rescatista);
    }
    
    @DeleteMapping("/rescatista/borrar/{id}")
    public void deleteRescatista(@PathVariable Long id){
        rescatistaService.deleteRescatista(id);
    }
    
}
