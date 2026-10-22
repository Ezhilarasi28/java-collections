/*### Exercise 2 – Unique Cities

You are given the following list of cities — some appear more than once:

```
Stockholm, Gothenburg, Malmö, Stockholm, Uppsala, Gothenburg, Lund
```

- Store them in a collection that automatically handles duplicates
- Print all unique cities and the total count
*/

package se.lexicon.collections;

import java.util.HashSet;

public class Exe2UniqueCities {


        public HashSet<String> createUniqueCities() {

            //step1 hashset creation
            HashSet<String> cities = new HashSet<>();

            //step2 add the cities
            cities.add("Stockholm");
            cities.add("Gothenburg");
            cities.add("Malmö");
            cities.add("Stockholm");
            cities.add("Uppsala");
            cities.add("Gothenburg");
            cities.add("Lund");

            return cities;
        }
        void main ()
        {
            HashSet<String> cities = createUniqueCities();
            //step3 print unique cities
            IO.println("Unique cities:");


            for (String city : cities) {
                IO.println(city);
            }
            //step4 print total count
            IO.println("Total unique cities: " + cities.size());
        }
    }

