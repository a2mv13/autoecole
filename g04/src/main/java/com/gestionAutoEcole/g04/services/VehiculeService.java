package com.gestionAutoEcole.g04.services;

import com.gestionAutoEcole.g04.entities.Vehicule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehiculeService {
    Vehicule saveVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    Vehicule getVehicule(Long id);
    List<Vehicule> getAllVehicules();
    void deleteVehiculeById(Long id);
    void deleteAllVehicules();
}
