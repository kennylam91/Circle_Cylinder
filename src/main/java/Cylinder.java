public class Cylinder extends Circle {
    Cylinder() {
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    @Override
    public String toString(){
        return "Cylinder: "+this.getRadius()+","+this.getColor()+","+this.getArea()+","+this.getVolume();
    }

}
