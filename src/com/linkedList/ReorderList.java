package com.linkedList;
//https://leetcode.com/problems/reorder-list/description/
public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //middle node
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //reverse LL
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode headFirst = head;
        ListNode headSecond = reverseList(mid);
        while (headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if(headFirst != null){
            headFirst.next = null;
        }
    }
}
