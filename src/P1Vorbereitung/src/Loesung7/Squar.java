package P1Vorbereitung.src.Loesung7;

public class Squar extends Shape{

    private double width;

    public Squar(double width){
        this.width = width;
    }
    @Override
    public double calculateArea() {

        return width * width;
    }

    @Override
    public double calculatePerimeter( ) {
        return 4* width;
    }
}
