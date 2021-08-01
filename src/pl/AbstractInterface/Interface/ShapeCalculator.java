package pl.AbstractInterface.Interface;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,10);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód prostokątu: " + rectangle.calculatePerimeter());
        System.out.println(circle.getData());

        System.out.println(StringUtils.reverseString("ABC"));




    }
}
