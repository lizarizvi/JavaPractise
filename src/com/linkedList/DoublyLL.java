package com.linkedList;

public class DoublyLL {

    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = null;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + "-> ");
            node = node.next;
        }
        System.out.println("end");
    }

//    public void displayReverse(){
//        Node last = head;
//        while (last.next != null){
//            last = last.next;
//        }
//        while (last != null){
//            System.out.print(last.value + "<- ");
//            last = last.prev;
//        }
//        System.out.println("start");
//    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insertAtIndex(int val, int index){
        Node node = head;
        if (index == 0){
            insertFirst(val);
            return;
        }
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        Node newNode = new Node(val, node.next, node);
        newNode.next = node.next;
        node.next = newNode;
    }

    public Node find(int value){
        Node node = head;
        while(node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int value){
        Node node = find(after);
        if (node == null){
            System.out.println("does not exists");
            return;
        }
        Node newNode = new Node(value, node.next, node);
        node.next = newNode;
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    private static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
