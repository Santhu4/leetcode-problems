/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int cntA  = 0;
        int cntB  = 0;
        while(tempA != null){
            tempA = tempA.next;
            cntA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            cntB++;
        }
         tempA = headA;
         tempB = headB;
        while(cntA != cntB){
            if(cntA>cntB){
                tempA = tempA.next;
                cntA--;
            }else if(cntB>cntA){
                tempB = tempB.next;
                cntB--;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
           
            return tempA;
    }
}