package entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "adresse")
public class Adresse {

    @Column(name = "numero")
    private int numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "codePostale")
    private int codePostal;

    @Column(name = "ville")
    private String ville;

    // Constructeur
    public Adresse() {  }


    // Getter et Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
