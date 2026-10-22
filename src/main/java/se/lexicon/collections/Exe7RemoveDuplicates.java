/*Exercise 7 – Remove Duplicates, Keep Order

Given this list of numbers:

```
4, 7, 2, 7, 9, 4, 1, 9, 3
```

- Produce a new list with duplicates removed, preserving the original order
- Print the result

> **Think about it:** Which collection can help you track what you have already seen?*/



package se.lexicon.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exe7RemoveDuplicates {

    void main() {

        // Create a list of numbers
        List<Integer> numbers = List.of(4, 7, 2, 7, 9, 4, 1, 9, 3);

        // Call the method
        List<Integer> result = removeDuplicates(numbers);

        // Print the result
        IO.println("Original list: " + numbers);
        IO.println("Without duplicates: " + result);
    }

    // Method to remove duplicates
    public List<Integer> removeDuplicates(List<Integer> numbers) {

        // Track numbers already seen
        HashSet<Integer> seen = new HashSet<>();

        // Store unique numbers in order
        ArrayList<Integer> result = new ArrayList<>();

        // Check each number
        for (int number : numbers) {

            // Add only new numbers
            if (seen.add(number)) {
                result.add(number);
            }
        }

        return result;
    }
}

