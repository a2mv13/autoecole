package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU;
    private String nomU;
    private String prenomU;
    private String emailU;
    private String mdpU;

    public Utilisateur() {
        super();
    }

    public Utilisateur(String nomU, String prenomU, String emailU, String mdpU) {
        this.nomU = nomU;
        this.prenomU = prenomU;
        this.emailU = emailU;
        this.mdpU = mdpU;
    }

    public Long getIdU() {
        return idU;
    }

    public void setIdU(Long idU) {
        this.idU = idU;
    }

    public String getNomU() {
        return nomU;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }

    public String getPrenomU() {
        return prenomU;
    }

    public void setPrenomU(String prenomU) {
        this.prenomU = prenomU;
    }

    public String getEmailU() {
        return emailU;
    }

    public void setEmailU(String emailU) {
        this.emailU = emailU;
    }

    public String getMdpU() {
        return mdpU;
    }

    public void setMdpU(String mdpU) {
        this.mdpU = mdpU;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idU=" + idU +
                ", nomU='" + nomU + '\'' +
                ", prenomU='" + prenomU + '\'' +
                ", emailU='" + emailU + '\'' +
                ", mdpU='" + mdpU + '\'' +
                '}';
    }
}
