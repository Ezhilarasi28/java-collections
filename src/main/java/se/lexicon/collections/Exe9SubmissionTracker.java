

package se.lexicon.collections;

import java.util.HashSet;

public class Exe9SubmissionTracker {

    /*
     * I chose HashSet because it does not allow duplicates.
     * Each student can submit homework only once.
     * I only need to store student names.
     * The order of submissions does not matter.
     */

    void main() {

        HashSet<String> students = new HashSet<>();

        String[] submissions = {
                "Anu", "Priya", "Rahul", "Sara",
                "John", "Anu", "David", "Priya",
                "Emma", "Kumar"
        };

        for (String name : submissions) {

            if (students.add(name)) {
                IO.println(name + " submitted successfully.");
            } else {
                IO.println(name + " rejected. Already submitted!");
            }
        }

        IO.println("\nSubmitted Students:");

        for (String student : students) {
            IO.println(student);
        }

        IO.println("Total students: " + students.size());
    }
}
