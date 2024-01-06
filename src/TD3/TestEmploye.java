package TD3;

public class TestEmploye {
    public static void main(String[] args) {
        // class patron
        Patron patron = new Patron("Doe", "John", 5000.0);
        System.out.println("Patron:\n" + patron);
        System.out.println("Gains du patron: " + patron.gains());

        //class travailleur à commission
        TravailleurCommission travailleurCommission = new TravailleurCommission("Smith", "Alice", 2000.0, 0.05);
        travailleurCommission.setQuantite(100);
        System.out.println("\nTravailleur à commission:\n" + travailleurCommission);
        System.out.println("Gains du travailleur à commission: " + travailleurCommission.gains());

        // class travailleur horaire
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Johnson", "Bob", 20.0);
        travailleurHoraire.setHeures(40);
        System.out.println("\nTravailleur horaire:\n" + travailleurHoraire);
        System.out.println("Gains du travailleur horaire: " + travailleurHoraire.gains());
    }
}

