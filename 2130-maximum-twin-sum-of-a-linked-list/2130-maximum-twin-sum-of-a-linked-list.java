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
    public int pairSum(ListNode head) {
        int MaxSum=0;

        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode newHead=rev(slow.next);
        ListNode first=head;
        ListNode second=newHead;

        while(second!=null){
            int twinSum=first.val+second.val;
            first=first.next;
            second=second.next;
            MaxSum=Math.max(twinSum,MaxSum);

        }

        rev(newHead);
        return MaxSum;

        
    }

    public static ListNode rev(ListNode he){
        ListNode prev= null;
        ListNode cur=he;

        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }

        return prev;


    }
}