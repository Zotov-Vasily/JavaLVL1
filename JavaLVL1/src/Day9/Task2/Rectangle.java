package Day9.Task2;

public class Rectangle extends Figure{
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return(width * height);
    }

    @Override
    public double perimeter() {
        return(width + height)*2;
    }
}
