package TD2;

public class Banque {
    private int NCompte;
    private float Solde;
    private String CIN;
    public Banque(int NCompte, float Solde, String CIN){
        this.NCompte = NCompte;
        this.Solde = Solde;
        this.CIN = CIN;
    }
    public void Deposer(float somme){
        this.Solde+= somme;
        System.out.println("Vous avez deposé la somme : "+ somme);
    }
    public void Retirer(float somme){
        this.Solde-= somme;
        System.out.println("Vous avez retiré la somme : "+ somme);
    }
    public float avoirSolde(){
        return this.Solde;
    }
    public String avoirInf(){
        return "Votre CIN :"+this.CIN+
                " | Votre numero de compte : "+this.NCompte+
                " | Votre Solde : "+this.Solde;
    }
}
