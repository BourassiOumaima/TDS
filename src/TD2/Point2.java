package TD2;

public class Point2 {
    private String name;
    private double x,y ;
     public Point2(String name, double x, double y){
         this.name= name;
         this.x = x;
         this.y = y;
     }
     public Point2(){

     }
    public double Norme() {
        double distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distance;
    }
    public void Affich(){
        System.out.println("nom :" + this.name);
        System.out.println("les coordonnées sont :" + "("+ x+","+y+")");
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

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
