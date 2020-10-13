public class Pyramid extends Shape3D {
    private double length;
    private double width;
    private double height;

    public Pyramid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public String getName() {
        return "pyramid";
    }
    public double getArea() {
        return length*width + length*Math.sqrt(width*width/4+height*height)+width*Math.sqrt(length*length/4+height*height);
    }

    public double getVolume() {
        return length*width*height/3;
    }
}
