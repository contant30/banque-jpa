package entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Connexion {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();


//    Client c = new Client();
//    c.setNom("Contant");
//    c.setPrenom("Romain");
//    c.setDateNaissance(LocalDate.of(2025, 5, 10));
//
//    Adresse adresse = new Adresse();
//    adresse.setRue("rue de la joie");
//    adresse.setNumero(54);
//    adresse.setCodePostal(45632);
//    adresse.setVille("Montpellier");
//    c.setAdresse(adresse);
//
//   //

        Client c = em.find(Client.class,1);
        System.out.println(c);


        System.out.println("-".repeat(100));
        Operation o = em.find(Operation.class,1);
        System.out.println(o);

//        em.persist();
//        em.persist();
//        em.persist();
//
//        em.getTransaction().commit();


        }
    }