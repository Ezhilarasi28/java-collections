

package se.lexicon.collections;

import java.util.ArrayList;

public class Exe4LargestNum {

    void main() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(3);
        numbers.add(78);
        numbers.add(45);
        numbers.add(22);
        numbers.add(91);
        numbers.add(7);
        numbers.add(56);

        int largest = findLargest(numbers);

        IO.println("Largest number: " + largest);
    }

    // Method for JUnit testing
    public int findLargest(ArrayList<Integer> numbers) {

        int largest = numbers.getFirst();

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}
