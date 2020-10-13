public class Circle extends Shape2D {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public String getName() {
        return "circle";
    }
    public double getArea() {
        return 3.1416*radius*radius;
    }
}
