package TD3;

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle() {
        super("Rectangle");
        this.longueur = 1;
        this.largeur = 1;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Implémentation des méthodes de la classe Figure
    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    // Redéfinition de toString pour afficher les détails du rectangle
    @Override
    public String toString() {
        return "Rectangle{" +
                "nom='" + nom + '\'' +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", périmètre=" + getPerimeter() +
                ", aire=" + getAire() +
                '}';
    }
}

