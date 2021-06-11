package fr.rossatnicolas.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import fr.rossatnicolas.model.Chambre;
import fr.rossatnicolas.HibernateUtil;

public class ChambreService implements Serializable{

    public boolean create(Chambre c, Session s)
    {
        s.save(c); // INSERT

        return true;
    }

    public void delete(Session s, int id)
    {
        Chambre c = s.get(Chambre.class, id);
        s.delete(c);
    }

    public void update(Session s, int id)
    {
        Chambre c = s.get(Chambre.class, id);
        c.setEtage(3);
        s.update(c); // UPDATE
    }

    public Chambre findById(Session s, int id)
    {
        Chambre c = s.get(Chambre.class, id); // SELECT *
        return c;
    }

    public List<Chambre> findAll(Session s)
    {
        Query q = s.createQuery("from Chambre");
        List<Chambre> listeC = q.list();

        return listeC;
    }

}
