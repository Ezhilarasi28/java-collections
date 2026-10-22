

package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class Exe4LargestNumTest {

        Exe4LargestNum largestApp = new Exe4LargestNum();

        @Test
        @DisplayName("Find largest number from given list")
        void testLargestNumber() {

            ArrayList<Integer> numbers = new ArrayList<>(
                    Arrays.asList(14, 3, 78, 45, 22, 91, 7, 56)
            );

            assertEquals(91, largestApp.findLargest(numbers));
        }

        @Test
        @DisplayName("Find largest negative number")
        void testNegativeNumbers() {

            ArrayList<Integer> numbers = new ArrayList<>(
                    Arrays.asList(-10, -5, -20, -2)
            );

            assertEquals(-2, largestApp.findLargest(numbers));
        }

        @Test
        @DisplayName("Find largest when numbers are equal")
        void testEqualNumbers() {

            ArrayList<Integer> numbers = new ArrayList<>(
                    Arrays.asList(5, 5, 5, 5)
            );

            assertEquals(5, largestApp.findLargest(numbers));
        }

        @Test
        @DisplayName("Find largest with one number")
        void testSingleNumber() {

            ArrayList<Integer> numbers = new ArrayList<>(
                    List.of(42)
            );

            assertEquals(42, largestApp.findLargest(numbers));
        }
    }


