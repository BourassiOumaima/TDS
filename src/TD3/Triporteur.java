package TD3;

public class Triporteur extends Moto{
        private int capacite;
        public Triporteur(int nbP) {
            super(nbP);
            this.capacite = 0;
        }
        public Triporteur(int nbP, int capaciteCharge) {
            this(nbP);
            this.capacite = capaciteCharge;
        }
        public int getCapacite() {
            return capacite;
        }
        public void setCapacite(int capacite) {
            this.capacite = capacite;
        }
}
