package fr.rossatnicolas.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Salarie")
public class Salarie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "nom", nullable = true, unique = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = true, unique = false, length = 50)
    private String prenom;

    @Column(name = "salaire", nullable = true, unique = false, length = 50)
    private String salaire;

    @Column(name = "experience", nullable = true, unique = false, length = 50)
    private int experience;

    @ManyToOne
    @JoinColumn(name = "idDirecteur")
    private Directeur idDirecteur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Directeur getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(Directeur idDirecteur) {
        this.idDirecteur = idDirecteur;
    }
}
