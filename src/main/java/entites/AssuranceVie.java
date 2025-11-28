package entites;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
public class AssuranceVie extends Compte {

    @Column(name = "dateFin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;


    public AssuranceVie(String numero, double solde) {
        super(numero, solde);
    }
}
