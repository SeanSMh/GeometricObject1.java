/**
 * @author: Sean
 * @time: 2018-01-09.
 **/

import java.util.Date;

public class GeometricObject1 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dataCreated;

    public GeometricObject1() {
        dataCreated = new java.util.Date();
    }

    public GeometricObject1(String color, boolean filled) {
        dataCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "created on" + dataCreated + "\ncolor:" + color + "and filled:" + filled;
    }
}
