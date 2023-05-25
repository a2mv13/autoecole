package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Utilisateur;
import com.gestionAutoEcole.g04.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImp implements UtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur saveUtil(Utilisateur util) {
        return utilisateurRepository.save(util);
    }

    @Override
    public Utilisateur updateUtil(Utilisateur util) {
        return utilisateurRepository.save(util);
    }

    @Override
    public Utilisateur getUtil(Long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public List<Utilisateur> getAllUtils() {
        return utilisateurRepository.findAll();
    }

    @Override
    public void deleteUtilById(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public void deleteAllUtils() {
        utilisateurRepository.deleteAll();
    }
}
