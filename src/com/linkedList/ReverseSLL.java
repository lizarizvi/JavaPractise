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
}
