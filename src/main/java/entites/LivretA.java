package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class LivretA extends Compte {

    @Column(name = "taux")
    private double taux;


    public LivretA(String numero, double solde) {
        super(numero, solde);
    }
}
