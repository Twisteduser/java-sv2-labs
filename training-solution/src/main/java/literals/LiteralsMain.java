package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println( a + " " + b);
        System.out.println(Integer.toString(a) + Integer.toString(b));

        double quotient = 3/4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(40));

    }
}
