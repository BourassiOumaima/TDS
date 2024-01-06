package TD3;

public class Batiment {
    private String adresse;
    public Batiment() {
    }
    public Batiment(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString pour obtenir une représentation du Bâtiment
    @Override
    public String toString() {
        return "Bâtiment [adresse=" + adresse + "]";
    }
}
