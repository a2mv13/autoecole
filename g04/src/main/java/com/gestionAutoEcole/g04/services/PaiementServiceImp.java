package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Paiement;
import com.gestionAutoEcole.g04.repositories.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImp implements PaiementService{
    @Autowired
    PaiementRepository paiementRepository;
    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement getPaiement(Long id) {
        return paiementRepository.findById(id).get();
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public void deletePaiementById(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public void deleteAllPaiements() {
        paiementRepository.deleteAll();
    }
}
