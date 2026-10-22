package se.lexicon.collections;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Exe10ConcertQueue {

    /*
     * I chose Queue with ArrayDeque because it follows FIFO
     * (First In, First Out).
     * The first person in the queue enters the concert first.
     * New people join at the back of the queue.
     * ArrayDeque makes it easy to add and remove people.
     */

    void main() {

        Scanner scanner = new Scanner(System.in);
        Queue<String> concertQueue = new ArrayDeque<>();

        // Add 6 people directly
        concertQueue.offer("Arjun");
        concertQueue.offer("Kavya");
        concertQueue.offer("Vikram");
        concertQueue.offer("Meera");
        concertQueue.offer("Karthik");
        concertQueue.offer("Divya");

        IO.println("Original Concert Queue:");
        IO.println(concertQueue);

        // Ask user to add more people
        IO.print("\nHow many more people do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            IO.print("Enter person " + i + " name: ");
            String name = scanner.nextLine();

            concertQueue.offer(name);
        }

        IO.println("\nUpdated Concert Queue:");
        IO.println(concertQueue);

        // Let the first 2 people enter
        IO.println("\nPeople entering the concert:");

        IO.println(concertQueue.poll() + " entered the concert.");
        IO.println(concertQueue.poll() + " entered the concert.");

        // Print remaining queue
        IO.println("\nRemaining Concert Queue:");

        for (String person : concertQueue) {
            IO.println(person);
        }

        IO.println("People waiting: " + concertQueue.size());
    }
}