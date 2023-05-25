package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;
    private Double montant;
    private Date dateP;
    private Eleve auteur;

    public Paiement() {
        super();
    }

    public Paiement(Double montant, Date dateP, Eleve auteur) {
        this.montant = montant;
        this.dateP = dateP;
        this.auteur = auteur;
    }

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDateP() {
        return dateP;
    }

    public void setDateP(Date dateP) {
        this.dateP = dateP;
    }

    public Eleve getAuteur() {
        return auteur;
    }

    public void setAuteur(Eleve auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "idP=" + idP +
                ", montant=" + montant +
                ", dateP=" + dateP +
                ", auteur=" + auteur +
                '}';
    }
}
