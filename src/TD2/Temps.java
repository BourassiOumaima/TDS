package TD2;

public class Temps {
    // Attributs
    private int heures;
    private int minutes;
    private int secondes;

    // Constructeurs
    public Temps() {
    }

    public Temps(int heures) {
        this.heures = heures;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public Temps(Temps temps) {
        this.heures = temps.getHeures();
        this.minutes = temps.getMinutes();
        this.secondes = temps.getSecondes();
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            System.out.println("ERREUR");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("ERREUR");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("ERREUR");
        }
    }

    // Méthodes
    public void ajouterHeures(int heure) {
        int nouvelleHeure = (this.heures + heure) % 24;
        this.heures = nouvelleHeure;
    }

    public void ajouterMinutes(int minutes) {
        int heuresToAdd = (this.minutes + minutes) / 60;
        ajouterHeures(heuresToAdd);
        this.minutes = (this.minutes + minutes) % 60;
    }

    public void ajouterSecondes(int secondes) {
        int minutesToAdd = (this.secondes + secondes) / 60;
        ajouterMinutes(minutesToAdd);
        this.secondes = (this.secondes + secondes) % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}
