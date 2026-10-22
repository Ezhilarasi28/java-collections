
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Exe9SubmissionTrackerTest {

    @Test
    @DisplayName("Student can submit homework once")
    void testStudentSubmission() {

        HashSet<String> students = new HashSet<>();

        assertTrue(students.add("Anu"));
        assertEquals(1, students.size());
    }

    @Test
    @DisplayName("Duplicate submission is rejected")
    void testDuplicateSubmission() {

        HashSet<String> students = new HashSet<>();

        students.add("Anu");

        assertFalse(students.add("Anu"));
        assertEquals(1, students.size());
    }

    @Test
    @DisplayName("Verify total unique students")
    void testUniqueStudentCount() {

        HashSet<String> students = new HashSet<>();

        students.add("Anu");
        students.add("Priya");
        students.add("Rahul");
        students.add("Sara");
        students.add("John");
        students.add("Anu");
        students.add("David");
        students.add("Priya");
        students.add("Emma");
        students.add("Kumar");

        assertEquals(8, students.size());
    }

    @Test
    @DisplayName("Verify submitted student exists")
    void testStudentExists() {

        HashSet<String> students = new HashSet<>();

        students.add("Anu");
        students.add("Priya");

        assertTrue(students.contains("Anu"));
        assertFalse(students.contains("Rahul"));
    }
}


