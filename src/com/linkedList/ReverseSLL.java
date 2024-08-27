package com.linkedList;
//https://leetcode.com/problems/reverse-linked-list/
public class ReverseSLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head){

//        you can also make a check over here for the below exception
//        if (head == null){
//            return head;
//        }

        ListNode prev = null;
        ListNode present = head;
        // ListNode next = present.next; //could throw null pointer exception
        while (present != null){
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }

    //https://leetcode.com/problems/reverse-linked-list-ii/description/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        //skip first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        //reverse
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

}
