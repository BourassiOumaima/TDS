package TD2;

public class Rectangle {
        private double longueur;
        private double largeur;

        // Constructeur par défaut
        public Rectangle() {
        }

        // Constructeur avec longueur et largeur
        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        // Constructeur avec objet rectangle
        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.getLongueur();
            this.largeur = rectangle.getLargeur();
        }

        // Accesseurs et mutateurs
        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            }
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            }
        }

        // Méthodes
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            return longueur == largeur;
        }

        @Override
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur= " + largeur + "]";
        }

}
