
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exe12GroupByFirstLetterTest {

    @Test
    @DisplayName("Verify three letter groups are created")
    void testGroupCount() {

        Map<Character, List<String>> groupedNames = new TreeMap<>();

        groupedNames.put('A', Arrays.asList("Alice", "Anna", "Amanda"));
        groupedNames.put('B', Arrays.asList("Bob", "Brian"));
        groupedNames.put('C', Arrays.asList("Charlie", "Carl"));

        assertEquals(3, groupedNames.size());
    }

    @Test
    @DisplayName("Verify names starting with A")
    void testGroupA() {

        Map<Character, List<String>> groupedNames = new TreeMap<>();

        groupedNames.put('A', Arrays.asList("Alice", "Anna", "Amanda"));

        assertEquals(3, groupedNames.get('A').size());
        assertTrue(groupedNames.get('A').contains("Anna"));
    }

    @Test
    @DisplayName("Verify names starting with B")
    void testGroupB() {

        Map<Character, List<String>> groupedNames = new TreeMap<>();

        groupedNames.put('B', Arrays.asList("Bob", "Brian"));

        assertEquals(2, groupedNames.get('B').size());
        assertTrue(groupedNames.get('B').contains("Brian"));
    }

    @Test
    @DisplayName("Verify alphabetical order of groups")
    void testAlphabeticalOrder() {

        Map<Character, List<String>> groupedNames = new TreeMap<>();

        groupedNames.put('C', Arrays.asList("Charlie", "Carl"));
        groupedNames.put('A', Arrays.asList("Alice", "Anna", "Amanda"));
        groupedNames.put('B', Arrays.asList("Bob", "Brian"));

        List<Character> letters = new ArrayList<>(groupedNames.keySet());

        assertEquals(Arrays.asList('A', 'B', 'C'), letters);
    }
}

