package P1Vorbereitung.src.Loesung7;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius =  radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius;
    }
}
