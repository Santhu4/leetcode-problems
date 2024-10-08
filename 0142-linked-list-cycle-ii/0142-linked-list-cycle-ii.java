/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        if (head == null || head.next == null)
            return null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        } else {
            fast = head;
            while (fast != slow) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
    }
}