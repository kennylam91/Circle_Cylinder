public class Circle {
    Circle(){

    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    private double radius;
    private String color;

    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color= color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Circle:"+radius+","+color+","+getArea();
    }

}
