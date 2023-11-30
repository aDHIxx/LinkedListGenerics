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
     * @name: search
     * @desc: Searches the linked list to find a node with the given value.
     * @param: T key
     * @return: Node<T> foundNode or null if not found
     */
    public Node<T> search(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return temp; // Node with the key found
            }
            temp = temp.next;
        }
        return null; // Node with the key not found
    }

    /*
     * @name: insertAfter
     * @desc: Inserts a new node with the given data after a specific node in the linked list.
     * @param: Node<T> prevNode, T data
     * @return: void
     */
    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null. Cannot insert.");
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
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


    /*
     * @name: getHead
     * @desc: Returns the head of the linked list.
     * @return: Node<T> head
     */
    public Node<T> getHead() {
        return head;
    }

    /*
     * @name: toString
     * @desc: Returns the string representation of the linked list.
     * @return: String
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            result.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        result.append("null");
        return result.toString();
    }

}

