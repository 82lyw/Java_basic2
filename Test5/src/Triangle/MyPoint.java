package Triangle;

public class MyPoint {

//    public static void main(String[] args) {
//        MyPoint p1 = new MyPoint();
//        MyPoint p2 = new MyPoint(10,30.5);
//        double dis = p1.distance(p2);
//        System.out.print(dis);
//    }

    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint secondPoint) {
        return distance(this, secondPoint);
    }

    public double distance(int x,int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
                * (this.y - y));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
                * (p1.y - p2.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
