package P1Vorbereitung.src.Loesung7;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
