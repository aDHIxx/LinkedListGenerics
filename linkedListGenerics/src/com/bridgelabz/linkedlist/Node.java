package com.bridgelabz.linkedlist;
/*
 *@name: Node
 * @param: <T>
 * @desc:  used to create a node.
 */
public class Node<T> {
    T data;
    Node<T> next;

    /*
     * @name: Node
     * @desc: Constructor for the Node class.
     * @param: T data
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return  data;
    }

    public Node<T> getNext() {
        return next;
    }
}

