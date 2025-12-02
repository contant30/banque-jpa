package fr.diginamic.entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;


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

//        Client c = em.find(Client.class,1);
//        System.out.println(c);
//
//
//        System.out.println("-".repeat(100));
//        Operation o = em.find(Operation.class,1);
//        System.out.println(o);

        //Banque b = new Banque();
        //b.setNom("caisse epargne");

//        Client client = new Client();
//        client.setNom("pierre");
//        b.setNom("la poste");

//        Banque b = new Banque();
//        b.setNom("caisse Epargne");
//        em.persist(b);
//
//
//        Client c = new Client();
//        c.setNom("claude");
//        c.setBanque(b);
//        em.persist(c);
//
//        LivretA la1 = new LivretA();
//        la1.setNumero("freee");
//        la1.setTaux(12.5);
//        la1.setSolde(12530);
//        em.persist(la1);

        AssuranceVie assu=new AssuranceVie();
        assu.setTaux(12);
        assu.setNumero("fr4586");
        assu.setTaux(15);
        assu.setDateFin(LocalDate.of(2025,10,10));
        //em.persist(assu);


        Compte compte = em.find(Compte.class, 1); // 1 = id du compte

        Virement vir=new Virement();
        vir.setBeneficiaire("Romain");
        vir.setMontant(150000);
        vir.setMotif("achat");
        vir.setDate(LocalDateTime.now());
        vir.setCompte(compte);

        em.persist(vir);

        em.getTransaction().commit();
        }
    }