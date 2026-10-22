
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Exe14CommonElementsTest {

    @Test
    @DisplayName("Verify common elements are 3 and 9")
    void testCommonElements() {

        List<Integer> listA = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> listB = Arrays.asList(3, 6, 9, 12, 15);

        Set<Integer> commonElements = new HashSet<>(listA);
        commonElements.retainAll(listB);

        assertEquals(Set.of(3, 9), commonElements);
    }

    @Test
    @DisplayName("Verify common elements count")
    void testCommonElementsCount() {

        List<Integer> listA = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> listB = Arrays.asList(3, 6, 9, 12, 15);

        Set<Integer> commonElements = new HashSet<>(listA);
        commonElements.retainAll(listB);

        assertEquals(2, commonElements.size());
    }

    @Test
    @DisplayName("Verify no common elements")
    void testNoCommonElements() {

        List<Integer> listA = Arrays.asList(1, 3, 5);
        List<Integer> listB = Arrays.asList(2, 4, 6);

        Set<Integer> commonElements = new HashSet<>(listA);
        commonElements.retainAll(listB);

        assertTrue(commonElements.isEmpty());
    }

    @Test
    @DisplayName("Verify duplicates are removed")
    void testDuplicateElements() {

        List<Integer> listA = Arrays.asList(1, 3, 3, 5, 9, 9);
        List<Integer> listB = Arrays.asList(3, 3, 9, 12);

        Set<Integer> commonElements = new HashSet<>(listA);
        commonElements.retainAll(listB);

        assertEquals(Set.of(3, 9), commonElements);
        assertEquals(2, commonElements.size());
    }
}

