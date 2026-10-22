package se.lexicon.collections;

import java.util.*;

public class Exe11StudentGrades {

    /*
     * I chose HashMap to store student names and grades.
     * Each student has one grade.
     * HashMap makes it easy to find grades by student name.
     * I use a List to sort the students by grade,from highest to lowest.
     */

    void main() {

        // Store student names and grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Karthikeyan", 85);
        studentGrades.put("Nandhini", 92);
        studentGrades.put("Praveen", 78);
        studentGrades.put("Abinaya", 95);
        studentGrades.put("Saravanan", 88);
        studentGrades.put("Deepika", 90);

        // Print all students
        IO.println("Student Grades:");
        IO.println(studentGrades);

        // Find a students grade
        Scanner userInput = new Scanner(System.in);

        IO.print("\nEnter student name to find grade: ");
        String studentName = userInput.nextLine();

        if (studentGrades.containsKey(studentName))
        {
            IO.println(studentName + "'s grade: "
                    + studentGrades.get(studentName));
        } else
        {
            IO.println("Student not found.");
        }

        // Convert HashMap entries into a List
        List<Map.Entry<String, Integer>> sortedStudents =
                new ArrayList<>(studentGrades.entrySet());

        // Sort grades from highest to lowest
        sortedStudents.sort(
                (student1, student2) ->
                        Integer.compare(
                                student2.getValue(),
                                student1.getValue()
                        )
        );

        // Print sorted students
        IO.println("\nStudents Sorted by Grade (Highest to Lowest):");

        for (Map.Entry<String, Integer> student : sortedStudents) {
            IO.println(student.getKey() + " : " + student.getValue());
        }
    }
}

