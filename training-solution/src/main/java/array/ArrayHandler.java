package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source){
        for (int i =0; i<source.length;i++){
            source[i] = source[i]+i;}
        }
    public void concatenateIndexToWord(String[] source){
        for (int i =0; i<source.length;i++){
            source[i] = source[i]+i;
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int [] numbers = {2,4,6,8,10};
        String [] strings = {"hammer", "table", "wheel", "screen", "idea"};

        arrayHandler.addIndexToNumber(numbers);
        for (int i : numbers){
            System.out.println(i);
        }
        for (int i : numbers){
            System.out.print((i) + ", ");
        }
        System.out.println("");

        arrayHandler.concatenateIndexToWord(strings);
        for (String i : strings){
            System.out.println(i);
        }
        for (String i : strings){
            System.out.print((i) + ", ");
        }
    }
}
