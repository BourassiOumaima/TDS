package TD3;

public class PointEx3 {
    private int x, y;
        public PointEx3 (int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        public void affiche() {
            System.out.println("Coordonnees : " + x + " " + y);
        }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
