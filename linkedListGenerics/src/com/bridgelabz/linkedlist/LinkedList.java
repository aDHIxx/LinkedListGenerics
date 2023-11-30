package com.bridgelabz.linkedlist;
/*
 * @name: LinkedList
 * @param: <T>
 * @desc:  used to create a linked list.
 */
public class LinkedList<T> {
    private Node<T> head;

    /*
     * @name: LinkedList
     * @desc: Constructor for the LinkedList class.
     */
    public LinkedList() {
        this.head = null;
    }

    /*
     * @name: append
     * @desc: Appends a new node with the given data to the linked list.
     * @param: T data
     * @return: void
     */
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /*
     * @name: insert
     * @desc: Inserts a new node with the given data after a specific node in the linked list.
     * @param: T data
     * @return: void
     */
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            // Inserting after the first node (56)
            Node<T> temp = head;
            while (temp != null && !temp.data.equals(56)) {
                temp = temp.next;
            }

            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Node with data 56 not found.");
            }
        }
    }

    /*
     * @name: pop
     * @desc: Deletes the first element in the linked list (pop operation).
     * @return: void
     */
    public void pop() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Linked List is empty. Cannot pop.");
        }
    }
    /*
     * @name: popLast
     * @desc: Deletes the last element in the linked list (popLast operation).
     * @return: void
     */
    public void popLast() {
        if (head == null) {
            System.out.println("Linked List is empty. Cannot popLast.");
            return;
        }

        if (head.next == null) {
            // If there's only one element, set head to null
            head = null;
        } else {
            // Traverse to the second last node
            Node<T> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // Set the second last node's next to null
            temp.next = null;
        }
    }


    /*
     * @name: display
     * @desc: Displays the elements of the linked list.
     * @return: void
     */
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

