public class Main_Shape {
    public static void main(String[] args) {

        Circle c = new Circle(4);

        System.out.println(c.angleOfSector(30));

        c.finiteElementFormulation();

        c.drawCoordinates(3, 4);

        c.arc();

        System.out.println(c.area());

        System.out.println(c.perimeter());

    }
}
