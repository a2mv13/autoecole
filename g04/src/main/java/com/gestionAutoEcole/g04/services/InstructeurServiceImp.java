package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Instructeur;
import com.gestionAutoEcole.g04.repositories.InstructeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructeurServiceImp implements InstructeurService{
    @Autowired
    InstructeurRepository instructeurRepository;
    @Override
    public Instructeur saveInstructeur(Instructeur instructeur) {
        return instructeurRepository.save(instructeur);
    }

    @Override
    public Instructeur updateInstructeur(Instructeur instructeur) {
        return instructeurRepository.save(instructeur);
    }

    @Override
    public Instructeur getInstructeur(Long id) {
        return instructeurRepository.findById(id).get();
    }

    @Override
    public List<Instructeur> getAllInstructeurs() {
        return instructeurRepository.findAll();
    }

    @Override
    public void deleteInstructeurById(Long id) {
        instructeurRepository.deleteById(id);
    }

    @Override
    public void deleteAllInstructeurs() {
        instructeurRepository.deleteAll();
    }
}
