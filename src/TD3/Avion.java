package TD3;

public class Avion extends Vehicule{
        private int nbMoteur;
        public Avion(int nbPassager, int nbMoteur) {
            super(nbPassager);
            this.nbMoteur = nbMoteur;
        }
    public Avion(int nbP) {
        super(nbP);
        this.nbMoteur = 0;
    }
    //public Avion(int nbP, int nbM) {
    //    this(nbP);
    //    this.nbMoteur = nbM;
    //}
        public int getNbMoteur() {
            return nbMoteur;
        }
        public void setNbMoteur(int nbMoteur) {
            this.nbMoteur = nbMoteur;
        }


}
