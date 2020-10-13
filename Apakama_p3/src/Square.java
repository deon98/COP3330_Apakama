public class Square extends Shape2D {
    private double length;

    public Square(double l) {
        length = l;
    }

    public String getName() {
        return "square";
    }
    public double getArea() {
        return length*length;
    }
}
