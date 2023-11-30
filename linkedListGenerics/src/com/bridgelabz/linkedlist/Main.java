package com.bridgelabz.linkedlist;
public class Main {
    public static void main(String[] args) {
        // Creating a simple linked list with values 56, 30, and 70
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(56);
        linkedList.append(70);
        linkedList.insert(30);
        // Displaying the elements of the linked list
        linkedList.display();
    }
}
