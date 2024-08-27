package com.linkedList;
//https://leetcode.com/problems/palindrome-linked-list/description/
public class PalindromeLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ListNode mid = middleNode(node);
        ListNode reverseSecond = reverseList(mid);
        while (node != null && reverseSecond != null){
            if (node.val != reverseSecond.val){
                break;
            }
            node = node.next;
            reverseSecond = reverseSecond.next;
        }
        return head == null || reverseSecond == null;
    }
}
