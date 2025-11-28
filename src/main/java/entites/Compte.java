package entites;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_VIR")

public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "SOLDE")
    private double solde;

    // jointure avec Operation
    @OneToMany(mappedBy = "compte")
    private Set<Operation> operation;

    // jointure avec Client
    @ManyToMany
    @JoinTable(name="COM_CLI",
            joinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"))
    private Set<Client> client;


    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Compte() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Set<Client> getClient() {
        return client;
    }

    public void setClient(Set<Client> client) {
        this.client = client;
    }
}
