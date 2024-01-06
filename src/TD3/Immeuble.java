package TD3;

public class Immeuble extends Batiment{
    private int nbAppart;
    public Immeuble() {
        super();
    }
    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Redéfinition de la méthode toString pour inclure le nombre d'appartements
    @Override
    public String toString() {
        return "Immeuble [adresse=" + getAdresse() + ", nbAppart=" + nbAppart + "]";
    }
}
