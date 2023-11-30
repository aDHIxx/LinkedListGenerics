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

