package math.math;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(5, 2));

        System.out.println(Math.min(5, 2));

        System.out.println(Math.PI);

        System.out.println(Math.round(Math.PI));

        System.out.println(Math.round(4.754));
        System.out.println(Math.round(-4.354));

        System.out.println(Math.abs(-3.2));
        System.out.println(Math.abs(8));

        System.out.println(Math.negateExact(-3));
        System.out.println(Math.negateExact(5));

        System.out.println(Math.addExact(3, 5));

        System.out.println(Math.subtractExact(10, 5));

        System.out.println(Math.multiplyExact(-4, -5));

        System.out.println(Math.pow(5.0, 3.0));

        System.out.println(Math.incrementExact(5));

        System.out.println(Math.decrementExact(5));

        System.out.println(Math.random());
    }
}