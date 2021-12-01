package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    @Test
    void countChildrenWithCorrectHeights(){
        List<Integer> heights = Arrays.asList(123,134,115,156,167,118);
        Height height = new Height();
        int expected = height.countChildrenWithHeightGreaterThan(heights,120);

        assertEquals(4, expected);
    }
}
