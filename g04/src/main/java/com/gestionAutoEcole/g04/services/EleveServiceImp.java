package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Eleve;
import com.gestionAutoEcole.g04.repositories.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveServiceImp implements EleveService{
    @Autowired
    EleveRepository eleveRepository;
    @Override
    public Eleve saveEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    @Override
    public Eleve updateEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    @Override
    public Eleve getEleve(Long id) {
        return eleveRepository.findById(id).get();
    }

    @Override
    public List<Eleve> getAllEleves() {
        return eleveRepository.findAll();
    }

    @Override
    public void deleteEleveById(Long id) {
        eleveRepository.deleteById(id);
    }

    @Override
    public void deleteAllEleves() {
        eleveRepository.deleteAll();
    }
}
