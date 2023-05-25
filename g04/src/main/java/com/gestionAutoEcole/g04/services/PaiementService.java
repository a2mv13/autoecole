package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Paiement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaiementService {
    Paiement savePaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    Paiement getPaiement(Long id);
    List<Paiement> getAllPaiements();
    void deletePaiementById(Long id);
    void deleteAllPaiements();
}
