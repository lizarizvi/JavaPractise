package com.linkedList;
//https://leetcode.com/problems/linked-list-cycle/
public class LLCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    //length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode node = slow;
                int length = 0;
                do{
                    node = node.next;
                    length++;
                } while (node != fast);
                return length;
            }
        }
        return 0;
    }

    //https://leetcode.com/problems/linked-list-cycle-ii/description/
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        while (length > 0){
            second = second.next;
            length--;
        }
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
