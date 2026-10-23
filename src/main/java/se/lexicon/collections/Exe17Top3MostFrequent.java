
package se.lexicon.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exe17Top3MostFrequent {

    void main() {

        List<String> words = List.of(
                "java", "python", "java", "c++",
                "python", "java", "ruby", "c++",
                "python", "ruby", "java"
        );

        List<Map.Entry<String, Integer>> result = findTop3(words);

        IO.println("Top 3 most frequent words:");

        for (Map.Entry<String, Integer> entry : result) {
            IO.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static List<Map.Entry<String, Integer>> findTop3(List<String> words) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount.entrySet()
                .stream()
                .sorted(
                        Map.Entry.<String, Integer>comparingByValue()
                                .reversed()
                                .thenComparing(Map.Entry.comparingByKey())
                )
                .limit(3)
                .toList();
    }
}
