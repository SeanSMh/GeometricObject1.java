/**
 * @author: Sean
 * @time: 2018-01-09.
 **/
public class Circle4 extends GeometricObject1{ // 继承自GeometricObject1
    private double radius;   //本身独有的属性

    public Circle4() {
    }

    public Circle4 (double radius){
        this.radius = radius;
    }

    public Circle4(double readius,String color,boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double redius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getDiameter() {
        return 2*radius;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created" + getDateCreated() + "and the radius is " + radius);
    }
}
