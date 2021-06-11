package fr.rossatnicolas.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import fr.rossatnicolas.model.Directeur;
import fr.rossatnicolas.HibernateUtil;

public class DirecteurService implements Serializable{

    public boolean create(Directeur d, Session s)
    {
        s.save(d); // INSERT INTO Directeur (nom, prenom) VALUES (d.getNom(), d.getPrenom());

        return true;
    }

    public void delete(Session s, int id)
    {
        Directeur d = s.get(Directeur.class, id);
        s.delete(d);
    }

    public void update(Session s, int id)
    {
        Directeur d = s.get(Directeur.class, id);
        d.setPrenom("Maxime");
        s.update(d); // UPDATE Directeur SET nom = c.getNom(), prenom = c.getPrenom() where id = id;
    }

    public Directeur findById(Session s, int id)
    {
        Directeur d = s.get(Directeur.class, id); // SELECT * FROM Directeur where id = id;
        return d;
    }

    public List<Directeur> findAll(Session s)
    {
        Query q = s.createQuery("from Directeur");
        List<Directeur> listeD = q.list();

        return listeD;
    }
}
