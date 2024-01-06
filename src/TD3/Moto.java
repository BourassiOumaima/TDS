package TD3;

public class Moto extends Vehicule{
    private int nbRoues = 2;
    public Moto(int nbPassager) {
        super(nbPassager);
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + " | Nombre de roues de la moto : " + nbRoues;
    }
}
