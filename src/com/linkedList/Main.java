package com.linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insertFirst(12);
        list.insertFirst(34);
        list.insertFirst(33);
        list.insertFirst(23);
        list.insertFirst(55);
        list.insertFirst(66);
        list.insertFirst(22);


        list.insertLast(99);

        list.insertAtIndex(20,3);

        list.display();
        System.out.println(list.deleteFirst());

        list.display();
        System.out.println(list.deleteLast());

        list.display();
        System.out.println(list.deleteAtIndex(5));

        list.display();
        System.out.println(list.find(22));
        System.out.println(list.find(33));
    }
}
