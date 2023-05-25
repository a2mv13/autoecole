package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Instructeur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idI;
    private String nomI;
    private String prenomI;
    private Long numeroI;
    private String adresseI;
    private Date dateEmbauche;

    public Instructeur() {
        super();
    }

    public Instructeur(String nomI, String prenomI, Long numeroI, String adresseI, Date dateEmbauche) {
        this.nomI = nomI;
        this.prenomI = prenomI;
        this.numeroI = numeroI;
        this.adresseI = adresseI;
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Instructeur{" +
                "idI=" + idI +
                ", nomE='" + nomI + '\'' +
                ", prenomE='" + prenomI + '\'' +
                ", numeroE=" + numeroI +
                ", adresseE='" + adresseI + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }

    public Long getIdI() {
        return idI;
    }

    public void setIdI(Long idI) {
        this.idI = idI;
    }

    public String getNomI() {
        return nomI;
    }

    public void setNomI(String nomI) {
        this.nomI = nomI;
    }

    public String getPrenomI() {
        return prenomI;
    }

    public void setPrenomI(String prenomI) {
        this.prenomI = prenomI;
    }

    public Long getNumeroI() {
        return numeroI;
    }

    public void setNumeroI(Long numeroI) {
        this.numeroI = numeroI;
    }

    public String getAdresseI() {
        return adresseI;
    }

    public void setAdresseI(String adresseI) {
        this.adresseI = adresseI;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
