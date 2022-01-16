package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumInts(){
        assertEquals(32,numbersSum.getSum(new int[]{12,3,-2,11,8}));
    }

    @Test
    void testGetSumString(){
        assertEquals(32,numbersSum.getSum(new String[]{"12","3","-2","11","8"}));
    }

    @Test
    void testGetSumIntNull(){
        int[] numbers=null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Nem lehet null!", ex.getMessage());
    }

    @Test
    void testGetSumStringNull(){
        String[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Nem lehet null!", ex.getMessage());
    }

    @Test
    void testGetSumIllegalNums(){
        String[] numbers = new String[]{"1", "2", "a", "3"};
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Nem megfelelő szám", ex.getMessage());
    }
}