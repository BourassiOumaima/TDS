package TD3;

public class Cercle extends Centre{
    private float rayon;

    public Cercle(int x, int y, char nom, float rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    // Redéfinition de la méthode affiche
    @Override
    public void affiche() {
        super.affiche();
        System.out.println(" | Rayon : " + rayon);
    }
}
