

package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exe11StudentGradesTest {

    @Test
    @DisplayName("Verify 6 students are added")
    void testStudentCount() {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Karthikeyan", 85);
        studentGrades.put("Nandhini", 92);
        studentGrades.put("Praveen", 78);
        studentGrades.put("Abinaya", 95);
        studentGrades.put("Saravanan", 88);
        studentGrades.put("Deepika", 90);

        assertEquals(6, studentGrades.size());
    }

    @Test
    @DisplayName("Verify student grade lookup")
    void testStudentGradeLookup() {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Karthikeyan", 85);
        studentGrades.put("Nandhini", 92);

        assertEquals(85, studentGrades.get("Karthikeyan"));
        assertEquals(92, studentGrades.get("Nandhini"));
    }

    @Test
    @DisplayName("Verify student exists")
    void testStudentExists() {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Abinaya", 95);
        studentGrades.put("Deepika", 90);

        assertTrue(studentGrades.containsKey("Abinaya"));
        assertFalse(studentGrades.containsKey("Rahul"));
    }

    @Test
    @DisplayName("Verify students sorted by highest grade")
    void testGradeSorting() {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Karthikeyan", 85);
        studentGrades.put("Nandhini", 92);
        studentGrades.put("Praveen", 78);
        studentGrades.put("Abinaya", 95);
        studentGrades.put("Saravanan", 88);
        studentGrades.put("Deepika", 90);

        List<Map.Entry<String, Integer>> sortedStudents =
                new ArrayList<>(studentGrades.entrySet());

        sortedStudents.sort(
                (student1, student2) ->
                        Integer.compare(
                                student2.getValue(),
                                student1.getValue()
                        )
        );

        assertEquals("Abinaya", sortedStudents.get(0).getKey());
        assertEquals(95, sortedStudents.get(0).getValue());
        assertEquals("Praveen", sortedStudents.get(5).getKey());
        assertEquals(78, sortedStudents.get(5).getValue());
    }
}
