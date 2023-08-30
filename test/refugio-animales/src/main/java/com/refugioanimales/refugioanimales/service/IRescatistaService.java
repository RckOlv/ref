package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Rescatista;

import java.util.List;

public interface IRescatistaService {
    
    public List<Rescatista> getRescatistas();

    public void saveRescatista(Rescatista rescatista);

    public void deleteRescatista(Long id);

    public void editRescatista(Rescatista rescatista);

    public Rescatista getRescatista(Long id);
    
}
