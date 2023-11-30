package com.bridgelabz.linkedlist;
/*
 *@name: Node
 * @param: <T>
 * @desc:  used to create a node.
 */
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

