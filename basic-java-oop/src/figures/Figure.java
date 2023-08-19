package figures;

import java.awt.*;

public abstract class Figure {
    Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public abstract double getSquare();

    public abstract String toString();
}
