
package se.lexicon.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exe12GroupByFirstLetter {

    void main() {

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Anna", "Charlie",
                "Brian", "Amanda", "Carl"
        );

        Map<Character, List<String>> groupedNames = new TreeMap<>();

        // Group names by first letter
        for (String name : names) {

            char firstLetter = name.charAt(0);

            groupedNames.putIfAbsent(firstLetter, new ArrayList<>());

            groupedNames.get(firstLetter).add(name);
        }


        IO.println("Names grouped by first letter:");

        for (Map.Entry<Character, List<String>> entry : groupedNames.entrySet()) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

