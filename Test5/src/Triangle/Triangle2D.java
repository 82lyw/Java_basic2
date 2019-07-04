package Triangle;
public class Triangle2D {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
        System.out.println("new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5))");
        System.out.println("Area is " + t1.getArea());
        System.out.println("Perimeter is " + t1.getPerimeter());
        System.out.println("t1.contains(3,3) is " + t1.contains(new MyPoint(3,3)));
        System.out.println("t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))) is "
                + t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))));
        System.out.println("t1.overlaps(new Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5))) is "
                + t1.overlaps(new Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5))));
    }

    private MyPoint p1,p2,p3;

    Triangle2D() {
        p1.setPoint(0,0);
        p2.setPoint(1,1);
        p3.setPoint(2,5);
    }

    Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public boolean contains(MyPoint p) {
        double areaS=this.getArea();
        double pA=(p.distance(p1)+p.distance(p2)+p1.distance(p2))/2;
        double pB=(p.distance(p1)+p.distance(p3)+p1.distance(p3))/2;
        double pC=(p.distance(p3)+p.distance(p2)+p3.distance(p2))/2;
        double areaA=Math.sqrt(pA*(pA-p.distance(p1))*(pA-p.distance(p2))*(pA-p1.distance(p2)));
        double areaB=Math.sqrt(pB*(pA-p.distance(p1))*(pB-p.distance(p3))*(pB-p1.distance(p3)));
        double areaC=Math.sqrt(pC*(pA-p.distance(p3))*(pC-p.distance(p2))*(pC-p3.distance(p2)));
        if(areaS==areaA+areaB+areaC)
            return true;
        else
            return false;
    }

    public boolean contains(Triangle2D t) {
        if(contains(t.p1)&&contains(t.p2)&&contains(t.p3))
            return true;
        else
            return false;
    }

    public boolean overlaps(Triangle2D t) {
        if ((this.p1 == t.p1 && this.p2 == t.p2 && this.p3 == t.p3) ||
                (this.p1 == t.p1 && this.p2 == t.p3 && this.p3 == t.p2) ||
                (this.p1 == t.p2 && this.p2 == t.p1 && this.p3 == t.p3) ||
                (this.p1 == t.p2 && this.p2 == t.p3 && this.p3 == t.p1) ||
                (this.p1 == t.p3 && this.p2 == t.p1 && this.p3 == t.p2) ||
                (this.p1 == t.p3 && this.p2 == t.p2 && this.p3 == t.p1))
            return true;
        else
            return false;
    }
}
