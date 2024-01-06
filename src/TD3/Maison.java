package TD3;

public class Maison extends Batiment{
    private int nbChambres;
    public Maison() {
        super();
    }
    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Redéfinition de la méthode toString pour inclure le nombre de chambres
    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbChambres=" + nbChambres + "]";
    }
}
