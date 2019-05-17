package polygon;

public class RegularPolygon {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6,4);
        RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("RegularPolygon(): perimeter = " +
                p1.getPerimeter() + " , area = " + p1.getArea());
        System.out.println("RegularPolygon(6,4): perimeter = " +
                p2.getPerimeter() + " , area = " + p2.getArea());
        System.out.println("RegularPolygon(10,4,5.6,7.8): perimeter = " +
                p3.getPerimeter() + " , area = " + p3.getArea());
    }

    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int n,double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int n,double side,double x,double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    void setN(int n) {
        this.n = n;
    }

    void setSide(int side) {
        this.side = side;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    int getN(int n) {
        return n;
    }

    double getSide(int side) {
        return side;
    }

    double getX(int x) {
        return x;
    }

    double getY(int y) {
        return y;
    }

    double getPerimeter() {
        double perimeter;
        perimeter = n * side;
        return perimeter;
    }

    double getArea() {
        double area;
        area = n * side * side / (4 * Math.tan(Math.PI / n));
        return area;
    }
}
