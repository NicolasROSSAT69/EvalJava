package fr.rossatnicolas.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_chambre", nullable = false, unique = true)
    private int num_chambre;

    @Column(name = "superficie", nullable = true, unique = false, length = 50)
    private String superficie;

    @Column(name = "type", nullable = true, unique = false, length = 50)
    private String type;

    @Column(name = "etage", nullable = true, unique = false, length = 50)
    private int etage;

    @ManyToOne
    @JoinColumn(name = "idHotel")
    private Hotel idHotel;

    public int getNum_chambre() {
        return num_chambre;
    }

    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public Hotel getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Hotel idHotel) {
        this.idHotel = idHotel;
    }
}
