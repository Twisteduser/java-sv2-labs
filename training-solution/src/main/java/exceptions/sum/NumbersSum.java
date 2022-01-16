package exceptions.sum;

public class NumbersSum {

    private int sum(int[] numbers){
        int sum =0;
        for (int number:numbers){
            sum+=number;
        }
        return sum;
    }
    public int getSum(int[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException("Nem lehet null!");
        }
        return sum(numbers);
    }

    private int[] convertNumbers(String[] numbers){
        int[] converted = new int[numbers.length];
        for (int i=0;i<numbers.length; i++){
            converted[i] = Integer.parseInt(numbers[i]);
        }
        return converted;
    }

    public int getSum(String[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException("Nem lehet null!");
        }
        int[] converted;
        try {
            converted=convertNumbers(numbers);
        }catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Nem megfelelő szám");
        }
        return sum(converted);
    }


}
