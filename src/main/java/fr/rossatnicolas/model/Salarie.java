package fr.rossatnicolas.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

    @Column(name = "idDirecteur", nullable = true, unique = false, length = 50)
    private int idDirecteur;


}
