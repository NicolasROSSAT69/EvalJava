package fr.rossatnicolas.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import fr.rossatnicolas.model.Hotel;
import fr.rossatnicolas.HibernateUtil;

public class HotelService implements Serializable{

    public boolean create(Hotel h, Session s)
    {
        s.save(h); // INSERT

        return true;
    }

    public void delete(Session s, int id)
    {
        Hotel h = s.get(Hotel.class, id);
        s.delete(h);
    }

    public void update(Session s, int id)
    {
        Hotel h = s.get(Hotel.class, id);
        h.setNom("Palace Jean Mace");
        s.update(h); // UPDATE
    }

    public Hotel findById(Session s, int id)
    {
        Hotel h = s.get(Hotel.class, id); // SELECT *
        return h;
    }

    public List<Hotel> findAll(Session s)
    {
        Query q = s.createQuery("from Hotel");
        List<Hotel> listeH = q.list();

        return listeH;
    }
}
