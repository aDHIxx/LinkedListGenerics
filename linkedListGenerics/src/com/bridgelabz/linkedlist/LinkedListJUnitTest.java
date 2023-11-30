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
}
