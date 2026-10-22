
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Exe8MergeWithoutDuplicatesTest {

    Exe8MergeWithoutDuplicates app = new Exe8MergeWithoutDuplicates();

    @Test
    @DisplayName("Merge two lists without duplicates")
    void testMergeLists() {

        Set<Integer> result = app.mergeLists(
                List.of(1, 2, 3, 4, 5),
                List.of(3, 4, 5, 6, 7)
        );

        assertEquals(Set.of(1, 2, 3, 4, 5, 6, 7), result);
    }

    @Test
    @DisplayName("Verify total unique numbers")
    void testUniqueCount() {

        Set<Integer> result = app.mergeLists(
                List.of(1, 2, 3, 4, 5),
                List.of(3, 4, 5, 6, 7)
        );

        assertEquals(7, result.size());
    }

    @Test
    @DisplayName("Merge lists with no duplicates")
    void testNoDuplicates() {

        Set<Integer> result = app.mergeLists(
                List.of(1, 2),
                List.of(3, 4)
        );

        assertEquals(Set.of(1, 2, 3, 4), result);
    }

    @Test
    @DisplayName("Merge two empty lists")
    void testEmptyLists() {

        Set<Integer> result = app.mergeLists(
                List.of(),
                List.of()
        );

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Merge lists containing the same numbers")
    void testSameNumbers() {

        Set<Integer> result = app.mergeLists(
                List.of(1, 2, 3),
                List.of(1, 2, 3)
        );

        assertEquals(Set.of(1, 2, 3), result);
    }
}

