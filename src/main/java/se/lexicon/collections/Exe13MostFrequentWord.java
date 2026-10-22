
package se.lexicon.collections;

import java.util.HashMap;
import java.util.Map;

public class Exe13MostFrequentWord {

    void main() {

        String[] words = {
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count how many times each word appears
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        IO.println("Word frequency: " + wordCount);

        // Find the most frequent word
        String mostFrequentWord = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {

            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        IO.println("Most frequent word: " + mostFrequentWord);
        IO.println("Count: " + highestCount);
    }
}
