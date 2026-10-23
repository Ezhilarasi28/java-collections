/*### Exercise 15 – Two Sum

Given a list of integers and a target number:

```
Numbers: 2, 7, 11, 15, 4, 6
Target: 13
```

- Find two numbers in the list that add up to the target and print them

> **Think about it:** Can you solve this without a nested loop?
Which collection lets you check for a value in constant time?*/






package se.lexicon.collections;

import java.util.HashSet;

public class Exe15TwoSum {

    void main() {

        int[] numbers = {2, 7, 11, 15, 4, 6};
        int target = 13;

        int[] result = findTwoSumResult(numbers, target);

        if (result.length == 2) {
            IO.println("Two numbers: " + result[0] + " and " + result[1]);
            IO.println("Total: " + target);
        } else
        {
            IO.println("Numbers not found.");
        }
    }

    public static int[] findTwoSumResult(int[] numbers, int target) {

        HashSet<Integer> seen = new HashSet<>();

        for (int number : numbers) {

            int complement = target - number;

            if (seen.contains(complement)) {
                return new int[]{complement, number};
            }

            seen.add(number);
        }

        return new int[]{};
    }
}
