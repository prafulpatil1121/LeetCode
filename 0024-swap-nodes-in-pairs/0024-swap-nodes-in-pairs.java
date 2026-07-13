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
class Solution {
     public ListNode swapPairs(ListNode head) {
        //Write your code here 
        if(head == null || head.next == null){
            return head;
        }
        ListNode start = head,end = head.next;

        start.next = swapPairs(end.next);
        end.next = start;
        return end;
    }
}