package com.example;

public class LinkedList<T> {
    private Node head ;

    public void append(T data)
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        Node current = head;
        // iterating through the linked list to tail
        while(current.getNext() != null)
        {
            current = current.getNext();
        }
        Node newNode = new Node(data);
        current.setNext(newNode);
    }

    public void prepend(T data)
    {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
