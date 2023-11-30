package com.bridgelabz.linkedlist;
public class Main {
    public static void main(String[] args) {
        // Creating a simple linked list with values 56, 30, and 70
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);

        // Displaying the elements of the linked list
        System.out.println("Linked List before pop:");
        linkedList.display();

        // Deleting the first element (pop)
        linkedList.pop();

        // Displaying the elements of the linked list after pop
        System.out.println("Linked List after pop:");
        linkedList.display();
    }
}
