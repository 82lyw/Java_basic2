
public class TestColorable {
    public static void main(String[] args) {
        GeometricObject1[] objects = {new Square(2), new Circle(3), new Square(5), new Square(4.5), new Circle(9)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable)objects[i]).howToColor();
            System.out.println();
        }
    }
}

class Square extends GeometricObject1 implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

class Circle extends GeometricObject1 {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is creates " +
                getDateCreated() + " and the radius is " + radius);

    }
}

interface Colorable {
    public abstract void howToColor();
}

abstract class GeometricObject1 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject1() {
    }

    protected GeometricObject1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor:" + color + " and filled:" + filled;
    }

    /**Abstract method findArea*/
    public abstract double getArea();

    /**Abstract method getPerimeter*/
    public abstract double getPerimeter();
}
