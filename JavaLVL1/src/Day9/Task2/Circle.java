package Day9.Task2;

public class Circle extends Figure{
    private double radiusCircle;

    public Circle(String color, double radiusCircle) {
        super(color);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double area() {
        return(Math.PI * (radiusCircle * radiusCircle));
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radiusCircle);
    }
}
