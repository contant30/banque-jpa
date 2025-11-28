package entites;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Livret_A")
public class LivretA extends Compte {

    @Column(name = "taux")
    private double taux;


    public LivretA(String numero, double solde) {
        super(numero, solde);
    }

    public LivretA() {

    }

    public void setTaux(double v) {
    }
}
