
package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exe5CountByLetterTest {

    Exe5CountByLetter countApp = new Exe5CountByLetter();

    ArrayList<String> names = new ArrayList<>(
            List.of("Anna", "Bob", "Alice", "Charlie",
                    "Amanda", "David", "Amy", "Brian")
    );

    @Test
    @DisplayName("Count names starting with A")
    void testLetterA() {
        assertEquals(4, countApp.countNamesByLetter(names, "A"));
    }

    @Test
    @DisplayName("Count names starting with lowercase a")
    void testLowercaseA() {
        assertEquals(4, countApp.countNamesByLetter(names, "a"));
    }

    @Test
    @DisplayName("Count names starting with B")
    void testLetterB() {
        assertEquals(2, countApp.countNamesByLetter(names, "B"));
    }

    @Test
    @DisplayName("Count names starting with C")
    void testLetterC() {
        assertEquals(1, countApp.countNamesByLetter(names, "C"));
    }

    @Test
    @DisplayName("Count names starting with unknown letter")
    void testUnknownLetter() {
        assertEquals(0, countApp.countNamesByLetter(names, "Z"));
    }
}
