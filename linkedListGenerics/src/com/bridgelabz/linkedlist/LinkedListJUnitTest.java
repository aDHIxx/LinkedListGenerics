package com.bridgelabz.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListJUnitTest {

    @Test
    void testSearch() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);

        Node<Integer> foundNode = linkedList.search(30);

        assertNotNull(foundNode);
        assertEquals(30, foundNode.data);
    }
    @Test
    void testInsertAfter() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);

        // Search for Node with key value 30
        Node<Integer> foundNode = linkedList.search(30);
        assertNotNull(foundNode);

        // Insert 40 after Node with key value 30
        linkedList.insertAfter(foundNode, 40);

        // Displaying the elements of the linked list after insertAfter
        System.out.println("Linked List after insertAfter:");
        linkedList.display();

        // Validate the final sequence
        String expected = "56 -> 30 -> 40 -> 70 -> null";
        String actual = linkedList.toString();
        assertEquals(expected, actual);
    }
}
