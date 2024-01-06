package TD3;

public class PointNom extends PointEx2 {
    private char nom;
    public void setPointNom(int x, int y, char nom) {
        this.setX(x);
        this.setY(y);
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + " | Nom : " + nom);
    }
}
