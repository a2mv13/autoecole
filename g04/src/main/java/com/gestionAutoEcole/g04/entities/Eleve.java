package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;



@Entity
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private String nomE;
    private String prenomE;
    private Long numeroE;
    private String adresseE;

    public Eleve() {
        super();
    }

    @Override
    public String toString() {
        return "Eleve{" +
                "idE=" + idE +
                ", nomE='" + nomE + '\'' +
                ", prenomE='" + prenomE + '\'' +
                ", numeroE=" + numeroE +
                ", adresseE='" + adresseE + '\'' +
                '}';
    }

    public Eleve(String nomE, String prenomE, Long numeroE, String adresseE) {
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.numeroE = numeroE;
        this.adresseE = adresseE;
    }

    public Long getIdE() {
        return idE;
    }

    public void setIdE(Long idE) {
        this.idE = idE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public Long getNumeroE() {
        return numeroE;
    }

    public void setNumeroE(Long numeroE) {
        this.numeroE = numeroE;
    }

    public String getAdresseE() {
        return adresseE;
    }

    public void setAdresseE(String adresseE) {
        this.adresseE = adresseE;
    }
}
