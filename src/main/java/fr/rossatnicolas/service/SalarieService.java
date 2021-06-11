package fr.rossatnicolas.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import fr.rossatnicolas.model.Salarie;
import fr.rossatnicolas.HibernateUtil;

public class SalarieService implements Serializable{

    public boolean create(Salarie sal, Session s)
    {
        s.save(sal); // INSERT

        return true;
    }

    public void delete(Session s, int id)
    {
        Salarie sal = s.get(Salarie.class, id);
        s.delete(sal);
    }

    public void update(Session s, int id)
    {
        Salarie sal = s.get(Salarie.class, id);
        sal.setNom("Jose");
        s.update(sal); // UPDATE
    }

    public Salarie findById(Session s, int id)
    {
        Salarie sal = s.get(Salarie.class, id); // SELECT *
        return sal;
    }

    public List<Salarie> findAll(Session s)
    {
        Query q = s.createQuery("from Salarie");
        List<Salarie> listeS = q.list();

        return listeS;
    }

}
