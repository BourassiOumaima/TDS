package TD3;

public class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;
    public TravailleurCommission() {
        super();
        this.salaire = 0;
        this.commission = 0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Méthode pour obtenir une représentation du travailleur à la commission
    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }

    // Méthode pour calculer les gains (salaire + commission) du travailleur à la commission
    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
}

