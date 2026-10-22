
package se.lexicon.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exe8MergeWithoutDuplicates {

    void main() {

        // Create two lists
        List<Integer> listA = List.of(1, 2, 3, 4, 5);
        List<Integer> listB = List.of(3, 4, 5, 6, 7);

        // Merge lists without duplicates
        Set<Integer> result = mergeLists(listA, listB);


        IO.println("Merged list: " + result);
        IO.println("Total unique numbers: " + result.size());
    }

    // Method for merging lists
    public Set<Integer> mergeLists(List<Integer> listA, List<Integer> listB) {

        // HashSet removes duplicate numbers
        HashSet<Integer> merged = new HashSet<>();

        // Add numbers from both lists
        merged.addAll(listA);
        merged.addAll(listB);

        return merged;
    }
}
