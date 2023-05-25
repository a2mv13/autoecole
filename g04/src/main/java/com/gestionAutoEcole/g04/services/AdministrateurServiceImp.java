package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Administrateur;
import com.gestionAutoEcole.g04.repositories.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurServiceImp implements AdministrateurService{
    @Autowired
    AdministrateurRepository administrateurRepository;
    @Override
    public Administrateur saveAdmin(Administrateur admin) {
        return administrateurRepository.save(admin);
    }

    @Override
    public Administrateur updateAdmin(Administrateur admin) {
        return administrateurRepository.save(admin);
    }

    @Override
    public Administrateur getAdmin(Long id) {
        return administrateurRepository.findById(id).get();
    }

    @Override
    public List<Administrateur> getAllAdmin() {
        return administrateurRepository.findAll();
    }

    @Override
    public void deleteAdminById(Long id) {
        administrateurRepository.deleteById(id);
    }
}
