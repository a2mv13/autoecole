package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Instructeur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstructeurService {
    Instructeur saveInstructeur(Instructeur instructeur);
    Instructeur updateInstructeur(Instructeur instructeur);
    Instructeur getInstructeur(Long id);
    List<Instructeur> getAllInstructeurs();
    void deleteInstructeurById(Long id);
    void deleteAllInstructeurs();
}
