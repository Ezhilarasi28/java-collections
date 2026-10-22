
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Exe13MostFrequentWordTest {

    @Test
    @DisplayName("Verify word frequency count")
    void testWordFrequency() {

        String[] words = {
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        assertEquals(3, wordCount.get("cat"));
        assertEquals(4, wordCount.get("dog"));
        assertEquals(1, wordCount.get("bird"));
        assertEquals(1, wordCount.get("fish"));
    }

    @Test
    @DisplayName("Verify most frequent word is dog")
    void testMostFrequentWord() {

        String[] words = {
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        assertEquals("dog", mostFrequentWord);
        assertEquals(4, highestCount);
    }

    @Test
    @DisplayName("Verify total unique words")
    void testUniqueWordCount() {

        String[] words = {
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        assertEquals(4, wordCount.size());
    }
}

