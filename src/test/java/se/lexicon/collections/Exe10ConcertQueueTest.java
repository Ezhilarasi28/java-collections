

package se.lexicon.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class Exe10ConcertQueueTest {

    @Test
    @DisplayName("Verify 6 people are added to the queue")
    void testAddPeople() {

        Queue<String> concertQueue = new ArrayDeque<>();

        concertQueue.offer("Arjun");
        concertQueue.offer("Kavya");
        concertQueue.offer("Vikram");
        concertQueue.offer("Meera");
        concertQueue.offer("Karthik");
        concertQueue.offer("Divya");

        assertEquals(6, concertQueue.size());
    }

    @Test
    @DisplayName("Verify first person enters first")
    void testFirstPerson() {

        Queue<String> concertQueue = new ArrayDeque<>();

        concertQueue.offer("Arjun");
        concertQueue.offer("Kavya");

        assertEquals("Arjun", concertQueue.poll());
    }

    @Test
    @DisplayName("Verify two people enter the concert")
    void testRemoveTwoPeople() {

        Queue<String> concertQueue = new ArrayDeque<>();

        concertQueue.offer("Arjun");
        concertQueue.offer("Kavya");
        concertQueue.offer("Vikram");
        concertQueue.offer("Meera");
        concertQueue.offer("Karthik");
        concertQueue.offer("Divya");

        concertQueue.poll();
        concertQueue.poll();

        assertEquals(4, concertQueue.size());
        assertEquals("Vikram", concertQueue.peek());
    }

    @Test
    @DisplayName("Verify remaining queue order")
    void testRemainingQueueOrder() {

        Queue<String> concertQueue = new ArrayDeque<>();

        concertQueue.offer("Arjun");
        concertQueue.offer("Kavya");
        concertQueue.offer("Vikram");
        concertQueue.offer("Meera");

        concertQueue.poll();
        concertQueue.poll();

        assertEquals("Vikram", concertQueue.poll());
        assertEquals("Meera", concertQueue.poll());
        assertTrue(concertQueue.isEmpty());
    }
}

