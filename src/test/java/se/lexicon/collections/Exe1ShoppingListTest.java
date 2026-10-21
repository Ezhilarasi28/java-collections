package se.lexicon.collections;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class Exe1ShoppingListTest {

    // Available to all four tests
    Exe1ShoppingList shoppingList = new Exe1ShoppingList();

    @Test
    @DisplayName("Verify that five items are added")
    void testAddingFiveItemsToShoppingList() {

        ArrayList<String> groceryList = shoppingList.createShoppingList();

        assertEquals(5, groceryList.size());
    }

    @Test
    @DisplayName("Verify that apple is in the shopping list")
    void testShoppingListContainsApple() {

        ArrayList<String> groceryList = shoppingList.createShoppingList();

        assertTrue(groceryList.contains("apple"));
    }

    @Test
    @DisplayName("Verify that apple is removed")
    void testRemovingAppleFromShoppingList() {

        ArrayList<String> groceryList = shoppingList.createShoppingList();

        shoppingList.removeItem(groceryList, "apple");

        assertFalse(groceryList.contains("apple"));
    }

    @Test
    @DisplayName("Verify four items remain")
    void testFourItemsRemainAfterRemoval() {

        ArrayList<String> groceryList = shoppingList.createShoppingList();

        shoppingList.removeItem(groceryList, "apple");

        assertEquals(4, groceryList.size());
    }
}