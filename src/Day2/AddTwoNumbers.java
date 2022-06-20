package Day2;


import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1 != null ? l1 : l2;
        ListNode tail = head;

        int sum = 0;
        int carry = 0;

        while (l1 != null || l2 != null) {
            sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            tail.val = sum % 10;
            carry = sum / 10;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;

            tail.next = l1 != null ? l1 : l2 != null ? l2 : carry != 0 ? new ListNode(carry) : null;
            tail = tail.next;
        }

        return head;

    }
}

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
