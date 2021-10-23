package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] a = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(a[1]);
        System.out.println(a.length);

        int [] b = new int[5];
        for (int i = 1; i < b.length ; i++){
            b[0] = 1;
            b[i] = b[i-1]*2;
        }
        System.out.print("Kettő első 5 hatványa: ");
        for(int i = 0; i< b.length; i++) {
            System.out.print(" " + b[i] + " ");
        }
        System.out.println("]");
        boolean[] c = new boolean[6];
        for (int i = 1; i < c.length ; i++){
            c[0] = false;
            c[i] = !c[i-1];
        }
        System.out.print("A boolean tömb:");
        for(int i = 0; i< c.length; i++) {
            System.out.print(" " + c[i] + " ");
        }
    }


    }
