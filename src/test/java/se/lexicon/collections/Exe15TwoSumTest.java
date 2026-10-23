

package se.lexicon.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exe15TwoSumTest {

    @Test
    void testTwoSumFound() {

        int[] numbers = {2, 7, 11, 15, 4, 6};

        int[] result = Exe15TwoSum.findTwoSumResult(numbers, 13);

        assertArrayEquals(new int[]{2, 11}, result);
    }

    @Test
    void testNoTwoSumFound() {

        int[] numbers = {1, 2, 3};

        int[] result = Exe15TwoSum.findTwoSumResult(numbers, 20);

        assertArrayEquals(new int[]{}, result);
    }
}


