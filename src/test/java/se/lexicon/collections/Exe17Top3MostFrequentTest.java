

package se.lexicon.collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Exe17Top3MostFrequentTest {

    @Test
    void testTop3MostFrequent() {

        List<String> words = List.of(
                "java", "python", "java", "c++",
                "python", "java", "ruby", "c++",
                "python", "ruby", "java"
        );

        List<Map.Entry<String, Integer>> result =
                Exe17Top3MostFrequent.findTop3(words);

        assertEquals(3, result.size());

        assertEquals("java", result.get(0).getKey());
        assertEquals(4, result.get(0).getValue());

        assertEquals("python", result.get(1).getKey());
        assertEquals(3, result.get(1).getValue());

        assertEquals("c++", result.get(2).getKey());
        assertEquals(2, result.get(2).getValue());
    }

    @Test
    void testWithDifferentWords() {

        List<String> words = List.of(
                "apple", "banana", "apple",
                "orange", "banana", "apple"
        );

        List<Map.Entry<String, Integer>> result =
                Exe17Top3MostFrequent.findTop3(words);

        assertEquals(3, result.size());
        assertEquals("apple", result.get(0).getKey());
        assertEquals(3, result.get(0).getValue());
        assertEquals("banana", result.get(1).getKey());
        assertEquals(2, result.get(1).getValue());
        assertEquals("orange", result.get(2).getKey());
        assertEquals(1, result.get(2).getValue());
    }

    @Test
    void testEmptyList() {

        List<String> words = List.of();

        List<Map.Entry<String, Integer>> result =
                Exe17Top3MostFrequent.findTop3(words);

        assertTrue(result.isEmpty());
    }
}

