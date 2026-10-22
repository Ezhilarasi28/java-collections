
package se.lexicon.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exe14CommonElements {

    void main() {

        // Create two lists
        List<Integer> listA = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> listB = Arrays.asList(3, 6, 9, 12, 15);

        // Convert List A into a HashSet
        Set<Integer> commonElements = new HashSet<>(listA);

        //  elements present in both lists
        commonElements.retainAll(listB);

        // Print results
        IO.println("List A: " + listA);
        IO.println("List B: " + listB);
        IO.println("Common Elements: " + commonElements);
    }
}
