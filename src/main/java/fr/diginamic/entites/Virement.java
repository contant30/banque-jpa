package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("virement")
public class Virement extends Operation{

    @Column(name = "beneficiaire")
    private String beneficiaire;

    public Virement() {
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
