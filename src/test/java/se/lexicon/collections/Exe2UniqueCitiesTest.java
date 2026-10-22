/*### Exercise 2 – Unique Cities

You are given the following list of cities — some appear more than once:

```
Stockholm, Gothenburg, Malmö, Stockholm, Uppsala, Gothenburg, Lund
```

- Store them in a collection that automatically handles duplicates
- Print all unique cities and the total count
*/


package se.lexicon.collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Exe2UniqueCitiesTest {

    Exe2UniqueCities uniqueCities = new Exe2UniqueCities();

    @Test
    @DisplayName("Verify that five unique cities are stored")
    void testUniqueCitiesCount() {

        HashSet<String> cities = uniqueCities.createUniqueCities();

        assertEquals(5, cities.size());
    }

    @Test
    @DisplayName("Verify that Stockholm exists in the set")
    void testStockholmExists() {

        HashSet<String> cities = uniqueCities.createUniqueCities();

        assertTrue(cities.contains("Stockholm"));
    }

    @Test
    @DisplayName("Verify that adding a duplicate does not change the set")
    void testDuplicateCitiesRemoved() {

        HashSet<String> cities = uniqueCities.createUniqueCities();

        // Stockholm already exists in the set
        boolean added = cities.add("Stockholm");

        // The duplicate must not be added
        assertFalse(added);

        // The count must stay at five
        assertEquals(5, cities.size());
    }

    @Test
    @DisplayName("Verify that all expected cities exist")
    void testAllCitiesExist() {

        HashSet<String> cities = uniqueCities.createUniqueCities();

        assertTrue(cities.contains("Stockholm"), "Stockholm is missing");
        assertTrue(cities.contains("Gothenburg"), "Gothenburg is missing");
        assertTrue(cities.contains("Malmö"), "Malmö is missing");
        assertTrue(cities.contains("Uppsala"), "Uppsala is missing");
        assertTrue(cities.contains("Lund"), "Lund is missing");
    }
}
