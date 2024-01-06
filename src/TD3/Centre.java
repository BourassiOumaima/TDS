package TD3;

public class Centre extends PointEx3{
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    // Redéfinition de la méthode affiche
    @Override
    public void affiche() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + " | Nom : " + nom);
    }
}
