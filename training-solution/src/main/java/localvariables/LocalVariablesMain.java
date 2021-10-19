package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println(b);

        int a=12;
        System.out.println(a);

        int i=2;
        int j=4;
        int k =i;
        System.out.println(i +", "+j+", "+k);

        String s ="Hello World";
        System.out.println(s);

        String t = s;
        System.out.println(t);
        {
            int x =0;
            System.out.println(x);
            System.out.println(a);
        }
    }
}
