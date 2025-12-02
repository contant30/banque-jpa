package fr.diginamic.entites;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "datenaissance")
    private LocalDate dateNaissance;

    @Embedded
    private Adresse adresse;

    // Jointure avec Banque
    @ManyToOne
    @JoinColumn(name = "BAN_ID")
    private Banque banque;

    public Client() {
    }

    // jointure avec Compte
    @ManyToMany
    @JoinTable(name="COM_CLI",
            joinColumns = @JoinColumn(name="ID_CLI", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="ID_COM",referencedColumnName="ID"))
    private Set<Compte> compte;



    // constructeur
    public Client(String nom) {   }


    // Gette et Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Set<Compte> getCompte() {
        return compte;
    }

    public void setCompte(Set<Compte> compte) {
        this.compte = compte;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setComptes(Set<Compte> comptes) {    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse=" + adresse +
                ", banque=" + banque +
                ", compte=" + compte +
                '}';
    }
}
