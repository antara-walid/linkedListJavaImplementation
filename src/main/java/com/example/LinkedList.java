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

    public void deleteByValue(T data)
    {
        if(head.getData() == data )
        {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null)
        {
            if(current.getNext().getData() == data ) // here in general case I should use comparable
            {
                // deleting the node
                current.setNext(current.getNext().getNext());
                return;
            }

            current = current.getNext();
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
