

package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exe7RemoveDuplicatesTest {

    Exe7RemoveDuplicates app = new Exe7RemoveDuplicates();

    @Test
    @DisplayName("Remove duplicates and keep original order")
    void testRemoveDuplicates() {

        List<Integer> numbers = List.of(4, 7, 2, 7, 9, 4, 1, 9, 3);

        List<Integer> result = app.removeDuplicates(numbers);

        assertEquals(List.of(4, 7, 2, 9, 1, 3), result);
    }

    @Test
    @DisplayName("List without duplicates")
    void testNoDuplicates() {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        assertEquals(numbers, app.removeDuplicates(numbers));
    }

    @Test
    @DisplayName("All numbers are duplicates")
    void testAllDuplicates() {

        List<Integer> numbers = List.of(5, 5, 5, 5);

        assertEquals(List.of(5), app.removeDuplicates(numbers));
    }

    @Test
    @DisplayName("Empty list")
    void testEmptyList() {

        assertEquals(List.of(), app.removeDuplicates(List.of()));
    }

    @Test
    @DisplayName("Negative and positive numbers")
    void testNegativeNumbers() {

        List<Integer> numbers = List.of(-2, 3, -2, 5, 3);

        assertEquals(List.of(-2, 3, 5), app.removeDuplicates(numbers));
    }
}
