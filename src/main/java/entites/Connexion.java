package entites;

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
        EntityTransaction transaction = em.getTransaction();transaction.begin();


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


        Virement v = new Virement();
        v.setMontant(100);
        v.setMotif("Transfert");
        v.setDate(LocalDateTime.now());
        v.setBeneficiaire("Alice");

        em.persist(v);

    transaction.commit();

    }
}
