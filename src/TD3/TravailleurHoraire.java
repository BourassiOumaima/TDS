package TD3;

public class TravailleurHoraire extends Employe {
    private double retribution;
    private double heures;
    public TravailleurHoraire() {
        super();
        this.retribution = 0;
        this.heures = 0;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = 0;
    }
    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }
    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }
    @Override
    public double gains() {
        return retribution * heures;
    }
}

