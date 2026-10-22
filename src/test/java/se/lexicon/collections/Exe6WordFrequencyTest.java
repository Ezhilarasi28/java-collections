
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Exe6WordFrequencyTest {

    Exe6WordFrequency wordApp = new Exe6WordFrequency();

    @Test
    @DisplayName("Verify word frequency counts")
    void testWordFrequency() {

        List<String> words = List.of(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape", "orange"
        );

        Map<String, Integer> result = wordApp.countWords(words);

        assertAll(
                () -> assertEquals(3, result.get("apple")),
                () -> assertEquals(2, result.get("banana")),
                () -> assertEquals(1, result.get("grape")),
                () -> assertEquals(2, result.get("orange"))
        );
    }

    @Test
    @DisplayName("Verify words are sorted alphabetically")
    void testAlphabeticalOrder() {

        List<String> words = List.of("orange", "apple", "banana");

        Map<String, Integer> result = wordApp.countWords(words);

        assertEquals(
                List.of("apple", "banana", "orange"),
                new ArrayList<>(result.keySet())
        );
    }

    @Test
    @DisplayName("Verify a single word")
    void testSingleWord() {

        Map<String, Integer> result = wordApp.countWords(
                List.of("grape")
        );

        assertEquals(1, result.get("grape"));
        assertEquals(1, result.size());
    }

    @Test
    @DisplayName("Verify an empty list")
    void testEmptyList() {

        Map<String, Integer> result = wordApp.countWords(
                List.of()
        );

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Verify repeated words")
    void testRepeatedWords() {

        Map<String, Integer> result = wordApp.countWords(
                List.of("apple", "apple", "apple")
        );

        assertEquals(3, result.get("apple"));
        assertEquals(1, result.size());
    }
}
