public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double r) {
        radius = r;
    }

    public String getName() {
        return "sphere";
    }
    public double getArea() {
        return 4*3.14159*radius*radius;
    }

    public double getVolume() {
        return 4*3.14159*radius*radius*radius/3;
    }
}
