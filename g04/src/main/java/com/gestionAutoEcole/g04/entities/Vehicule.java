package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

@Entity
public class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idV;
    private String modele;
    private String immatriculation;

    public Vehicule() {
        super();
    }

    public Vehicule(String modele, String immatriculation) {
        this.modele = modele;
        this.immatriculation = immatriculation;
    }

    public Long getIdV() {
        return idV;
    }

    public void setIdV(Long idV) {
        this.idV = idV;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "idV=" + idV +
                ", modele='" + modele + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                '}';
    }
}
