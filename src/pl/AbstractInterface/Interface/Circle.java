package pl.AbstractInterface.Interface;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea(){
        return Circle.PI * r * r;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Circle.PI * r;
    }

    @Override
    public String getData() {
        return "ASD";
    }
}
