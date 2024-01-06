package TD3;

public class TestBatiment {
    public static void main(String[] args) {
        //classe Batiment
        Batiment bat1 = new Batiment();
        Batiment bat2 = new Batiment("123 Rue de la Ville");

        System.out.println(bat1);
        System.out.println(bat2);

        //classe Maison
        Maison m1 = new Maison();
        Maison m2 = new Maison("456 Avenue du Quartier", 3);

        System.out.println(m1);
        System.out.println(m2);

        //classe Immeuble
        Immeuble im1 = new Immeuble();
        Immeuble im2 = new Immeuble("789 Boulevard de la Ville", 10);

        System.out.println(im1);
        System.out.println(im2);
    }
}

