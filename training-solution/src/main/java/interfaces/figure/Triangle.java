package interfaces.figure;

public class Triangle implements Area{
    @Override
    public double getArea() {
        return (lenghtOfSide * height)/2.0;
    }

    private double lenghtOfSide;
    private double height;

    public Triangle(double lengthOfSide, double height) {
        this.lenghtOfSide = lengthOfSide;
        this.height = height;
    }

    public double getLengthOfSide() {
        return lenghtOfSide;
    }

    public double getHeight() {
        return height;
    }


}
