package figures;

public class Circle extends Figure{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "radius: " + radius + ";";
    }
}
