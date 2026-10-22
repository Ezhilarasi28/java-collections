/* Exercise 6 – Word Frequency

Given a list of words:

```
apple, banana, apple, orange, banana, apple, grape, orange
```

- Count how many times each word appears
- Print each word and its count, sorted alphabetically
*/
package se.lexicon.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exe6WordFrequency {

    void main() {

        List<String> words = List.of(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape", "orange"
        );

        Map<String, Integer> sortedWords = countWords(words);

        IO.println("--- Word Frequency ---");

        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Count words and return them in alphabetical order
    public Map<String, Integer> countWords(List<String> words) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return new TreeMap<>(wordCount);
    }
}

