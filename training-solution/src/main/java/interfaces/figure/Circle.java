package interfaces.figure;

public class Circle implements Area{
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


}
