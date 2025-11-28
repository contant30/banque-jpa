package entites;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "banque")
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column (name = "nom")
    private String nom;

    @OneToMany(mappedBy = "banque")
    private Set<Client> client;




    public Banque() {
        client=new HashSet<Client>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Set<Client> getClient() {
        return client;
    }

    public void setClient(Set<Client> client) {
        this.client = client;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
