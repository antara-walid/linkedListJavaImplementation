package com.example;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.prepend(0);

        Node current = list.getHead();
        while (current.getNext() != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());


        list.deleteByValue(4);


        current = list.getHead();
        System.out.println("*************");
        while (current.getNext() != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }
}
