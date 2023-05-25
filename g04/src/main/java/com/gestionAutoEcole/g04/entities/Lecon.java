package com.gestionAutoEcole.g04.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Lecon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idL;

    private Date dateL;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="idI", nullable=false )
    private Instructeur instructeur;

    @OneToOne ( cascade = CascadeType.ALL )
    @JoinColumn( name="idV", nullable=false )
    private Vehicule vehicule;
    @OneToOne ( cascade = CascadeType.ALL )
    @JoinColumn( name="idE", nullable=false )
    private Eleve eleve;

    public Lecon() {
        super();
    }

    public Lecon(Date dateL, Instructeur instructeur, Vehicule vehicule, Eleve eleve) {
        this.dateL = dateL;
        this.instructeur = instructeur;
        this.vehicule = vehicule;
        this.eleve = eleve;
    }

    @Override
    public String toString() {
        return "Lecon{" +
                "idL=" + idL +
                ", dateL=" + dateL +
                ", instructeur=" + instructeur +
                ", vehicule=" + vehicule +
                ", eleve=" + eleve +
                '}';
    }

    public Long getIdL() {
        return idL;
    }

    public void setIdL(Long idL) {
        this.idL = idL;
    }

    public Date getDateL() {
        return dateL;
    }

    public void setDateL(Date dateL) {
        this.dateL = dateL;
    }

    public Instructeur getInstructeur() {
        return instructeur;
    }

    public void setInstructeur(Instructeur instructeur) {
        this.instructeur = instructeur;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
