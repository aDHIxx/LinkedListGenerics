package com.bridgelabz.linkedlist;
/*
    * @name: SortedLinkedList
    * @param: <T>
    * @desc:  used to create a sorted linked list.
 */
public class SortedLinkedList<T extends Comparable<T>> {

    private Node<T> head;

    public SortedLinkedList() {
        this.head = null;
    }
/*
    * @name: add
    * @desc: Adds a new node with the given data to the sorted linked list.
    * @param: T data
    * @return: void
 */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || data.compareTo(head.data) < 0) {
            // If the list is empty or the new data is smaller than the head
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list to find the correct position
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /*
        * @name: pop
        * @desc: Deletes the first node of the linked list.
        * @param: void
        * @return: void
     */

    // toString method to represent the linked list as a string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
    public static void main(String[] args) {
        SortedLinkedList<Integer> orderedList = new SortedLinkedList<>();
        orderedList.add(56);
        orderedList.add(30);
        orderedList.add(40);
        orderedList.add(70);

        System.out.println("Ordered Linked List: " + orderedList);
    }
}
