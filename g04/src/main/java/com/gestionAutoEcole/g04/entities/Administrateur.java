package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "administrateurs")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idA")
    private Long idA;
    @Column (name = "nomA")
    private String nomA;
    @Column (name = "prenomA")
    private String prenomA;
    @Column (name = "emailA")
    private String emailA;
    @Column (name = "mdpA")
    private String mdpA;

    public Administrateur() {
        super();
    }

    public Administrateur(Long idA, String nomA, String prenomA, String emailA, String mdpA) {
        this.idA = idA;
        this.nomA = nomA;
        this.prenomA = prenomA;
        this.emailA = emailA;
        this.mdpA = mdpA;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "idA=" + idA +
                ", nomA='" + nomA + '\'' +
                ", prenomA='" + prenomA + '\'' +
                ", email='" + emailA + '\'' +
                ", mdp='" + mdpA + '\'' +
                '}';
    }

    public String getNomA() {
        return nomA;
    }

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public String getPrenomA() {
        return prenomA;
    }

    public void setPrenomA(String prenomA) {
        this.prenomA = prenomA;
    }

    public String getEmailA() {
        return emailA;
    }

    public void setEmailA(String emailA) {
        this.emailA = emailA;
    }

    public String getMdpA() {
        return mdpA;
    }

    public void setMdpA(String mdpA) {
        this.mdpA = mdpA;
    }
}
