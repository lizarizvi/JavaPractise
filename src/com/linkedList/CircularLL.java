package com.linkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public Node find(int value){
        Node node = head;
        if (head == null){
            return null;
        }
        do {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        } while(node != head);
        return null;
    }
    public void insertAfter(int after, int val){
        Node node = find(after);
        if (node == null){
            System.out.println(after + " does not exists in LL");
            return;
        }
        Node newNode = new Node(val, node.next);
        node.next = newNode;
    }
    public void display(){
        Node node = head;
        if (head == null){
            System.out.println("no element in LL");
            return;
        }
        do{
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node node = head;
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        if (node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            if (node.next.value == value){
                break;
            }
            node = node.next;
        } while (node != head);
        node.next = node.next.next;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
