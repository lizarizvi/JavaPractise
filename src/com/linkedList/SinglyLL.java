package com.linkedList;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;
    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }

    public void insertAtIndex(int val, int index){
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }
    public Node insertRecursion(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRecursion(val, index - 1, node.next);
        return node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1){
           return deleteFirst();
        }
        Node prevNode = get(size - 1);
        int val = tail.value;
        tail = prevNode;
        tail.next = null;
        return val;
    }
    public int deleteAtIndex(int index){
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index){ //returns the reference pointer to that node
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void bubbleSort(){
        bubble(size - 1, 0);
    }

    private void bubble(int row, int col) {
        if (row == 0){
            return;
        }
        if (col < row){
            Node f = get(col);
            Node s = get(col + 1);
            if (f.value > s.value){
                if (f == head){
                    head = s;
                    f.next = s.next;
                    s.next = f;
                } else if (s == tail) {
                    Node prev = get(col - 1);
                    prev.next = s;
                    tail = f;
                    f.next = null;
                    s.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = s;
                    f.next = s.next;
                    s.next = f;
                }
            }
            bubble(row, col + 1);
        } else {
            bubble(row - 1, 0);
        }
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
