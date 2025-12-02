package fr.diginamic.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Assurance_vie")
public class AssuranceVie extends Compte {

    @Column(name = "dateFin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;


    public AssuranceVie(String numero, double solde) {
        super(numero, solde);
    }

    public AssuranceVie() {

    }

    public void setTaux(double v) {
    }

    public void setDateFin(LocalDate of) {
    }
}
