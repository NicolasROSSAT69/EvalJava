package fr.rossatnicolas;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import fr.rossatnicolas.model.Chambre;
import fr.rossatnicolas.model.Hotel;
import fr.rossatnicolas.model.Directeur;
import fr.rossatnicolas.model.Salarie;
import fr.rossatnicolas.service.ChambreService;
import fr.rossatnicolas.service.HotelService;
import fr.rossatnicolas.service.SalarieService;
import fr.rossatnicolas.service.DirecteurService;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("App ok");

        SalarieService salarieService = new SalarieService();
        DirecteurService directeurService = new DirecteurService();

        Directeur d1 = new Directeur();
        d1.setNom("ROSSAT");
        d1.setPrenom("Nicolas");

        Salarie s1 = new Salarie();
        s1.setIdDirecteur(d1);
        s1.setNom("Michel");
        s1.setPrenom("Duce");
        s1.setSalaire(1008);

        Salarie s2 = new Salarie();
        s2.setIdDirecteur(d1);
        s2.setNom("RENE");
        s2.setPrenom("paul");
        s2.setSalaire(1010);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        directeurService.create(d1, session);
        salarieService.create(s1, session);
        salarieService.create(s2, session);

        Salarie maxSalaire = salarieService.findAll(session).stream().
                max(Comparator.comparingDouble(Salarie::getSalaire)).get();

        System.out.println("Le salaire le plus haut est " + maxSalaire.getSalaire());
    }
}
