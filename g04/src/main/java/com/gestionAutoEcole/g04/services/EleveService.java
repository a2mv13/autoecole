package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Eleve;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EleveService {
    Eleve saveEleve(Eleve eleve);
    Eleve updateEleve(Eleve eleve);
    Eleve getEleve(Long id);
    List<Eleve> getAllEleves();
    void deleteEleveById(Long id);
    void deleteAllEleves();
}
