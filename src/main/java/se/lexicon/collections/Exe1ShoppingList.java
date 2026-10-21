/*Exercise 1 – Shopping List

You are managing a shopping list.

- Create an `ArrayList<String>` and add 5 items
- Print all items numbered (1, 2, 3…)
- Remove one item by name
- Print the updated list
*/



package se.lexicon.collections;

import java.util.ArrayList;

public class Exe1ShoppingList {

    //step1: create shopping list
    public ArrayList<String> createShoppingList() {


        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("apple");
        groceryList.add("banana");
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("cheese");

        return groceryList;
    }

    // Method 2: Remove an item
    public void removeItem(ArrayList<String> groceryList, String item) {
        groceryList.remove(item);
    }

    // Main method
    void main() {

        ArrayList<String> groceryList = createShoppingList();

        IO.println("Shopping List:");

        for (int i = 0; i < groceryList.size(); i++) {
            IO.println((i + 1) + ". " + groceryList.get(i));
        }

        removeItem(groceryList, "apple");

        IO.println("\nUpdated Shopping List:");

        for (int i = 0; i < groceryList.size(); i++) {
            IO.println((i + 1) + ". " + groceryList.get(i));
        }//loop closes
    }//closes main()
}// closes Exe1ShoppingList class
