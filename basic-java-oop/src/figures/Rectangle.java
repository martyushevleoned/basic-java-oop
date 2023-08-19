package figures;

public class Rectangle extends Figure{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getSquare(){
        return width * height;
    }

    @Override
    public String toString() {
        return "width: " + width + "; height: " + height + ";";
    }
}
