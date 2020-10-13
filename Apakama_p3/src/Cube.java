public class Cube extends Shape3D {
    private double length;

    public Cube(double l) {
        length = l;
    }

    public String getName() {
        return "cube";
    }
    public double getArea() {
        return 6*length*length;
    }

    public double getVolume() {
        return length*length*length;
    }
}
