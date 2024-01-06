package TD3;

public class Vehicule {
        private int nbPassager;

        // Constructeur
        public Vehicule(int nbPassager) {
            this.nbPassager = nbPassager;
        }

        // Méthode toString
        @Override
        public String toString() {
            return "Nombre de passagers du véhicule : " + nbPassager;
        }

        // Accesseur pour le nombre de passagers
        public int getNbPassager() {
            return nbPassager;
        }

        // Mutateur pour le nombre de passagers
        public void setNbPassager(int nbPassager) {
            this.nbPassager = nbPassager;
        }

        public static void main(String[] args) {
            // Test de la classe Vehicule
            Vehicule vehicule = new Vehicule(5);
            System.out.println(vehicule); // Affiche : Nombre de passagers du véhicule : 5

            // Modification du nombre de passagers
            vehicule.setNbPassager(8);
            System.out.println(vehicule); // Affiche : Nombre de passagers du véhicule : 8
        }

}
