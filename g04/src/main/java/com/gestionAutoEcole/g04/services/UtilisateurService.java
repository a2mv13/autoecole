package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService {
    Utilisateur saveUtil(Utilisateur util);
    Utilisateur updateUtil(Utilisateur util);
    Utilisateur getUtil(Long id);
    List<Utilisateur> getAllUtils();
    void deleteUtilById(Long id);
    void deleteAllUtils();
}
