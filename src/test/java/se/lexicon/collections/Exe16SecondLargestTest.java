
package se.lexicon.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exe16SecondLargestTest {

    @Test
    void testSecondLargest() {

        int[] numbers = {34, 78, 23, 78, 91, 56, 91, 12};

        int result = Exe16SecondLargest.findSecondLrgest(numbers);

        assertEquals(78, result);
    }

    @Test
    void testSecondLargestWithDuplicates() {

        int[] numbers = {10, 20, 20, 30, 30, 40};

        int result = Exe16SecondLargest.findSecondLrgest(numbers);

        assertEquals(30, result);
    }

    @Test
    void testSecondLargestWithNegativeNumbers() {

        int[] numbers = {-10, -20, -5, -30};

        int result = Exe16SecondLargest.findSecondLrgest(numbers);

        assertEquals(-10, result);
    }
}

