package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Administrateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministrateurService {
    Administrateur saveAdmin(Administrateur admin);
    Administrateur updateAdmin(Administrateur admin);
    Administrateur getAdmin(Long id);
    List<Administrateur> getAllAdmin();
    void deleteAdminById(Long id);
}
