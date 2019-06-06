public class mainProgram {
    public static void main(String[] args) {

        Circle circle = new Circle(5, "Blue");
        System.out.println(circle.toString());


        Cylinder cylinder = new Cylinder(5, "Blue", 4);
        System.out.println(cylinder.toString());
    }
}
