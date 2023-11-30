package com.bridgelabz.linkedlist;
/*
 * @name: LinkedList
 * @param: <T>
 * @desc:  used to create a linked list.
 */
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    /*
     * @name: add
     * @desc: Adds a new node with the given data to the linked list.
     * @param: T data
     * @return: void
     */
    public void add(T data) {
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

