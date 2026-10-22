/*Exercise 5 – Count by Letter

Given a list of names:

```
Anna, Bob, Alice, Charlie, Amanda, David, Amy, Brian
```

- Ask the user to enter a letter
- Count and print how many names start with that letter (case-insensitive)
*/
package se.lexicon.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe5CountByLetter {

    void main() {

        Scanner userInput = new Scanner(System.in);

        // Step 1: Create a list of names
        ArrayList<String> names = new ArrayList<>(
                List.of("Anna", "Bob", "Alice", "Charlie",
                        "Amanda", "David", "Amy", "Brian")
        );

        // Step 2: Ask the user to enter a letter
        IO.print("Enter a letter: ");
        String letter = userInput.nextLine().trim();

        // Step 3: Call the method
        int count = countNamesByLetter(names, letter);

        // Step 4: Print the result
        IO.println("Names starting with " + letter + ": " + count);
    }

    // Method for counting names and JUnit testing
    public int countNamesByLetter(ArrayList<String> names, String letter) {

        int count = 0;

        for (String name : names) {
            if (name.toLowerCase().startsWith(letter.toLowerCase())) {
                count++;
            }
        }

        return count;
    }
}
