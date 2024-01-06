package TD2;

public class Point1 {
    private String name ;
    private double x ;
    Point1(String name, double x){
        this.name = name;
        this.x = x;
    }
    public void Affich(){
        System.out.println("le nom de ce point est :" +this.getName()+"  et son abscisse est :"+this.getX());
    }
    public double Translate(double dx){
        this.x+=dx;
        System.out.println("la translation est effectuée");
        return this.x;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
