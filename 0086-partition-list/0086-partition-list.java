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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next==null) return head;
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(0);

        ListNode l = a;
        ListNode r = b;

        while(head!=null){
            if(head.val<x){
                l.next=head;
                l=l.next;
            }
            else{
                r.next=head;
                r=r.next;
            }
            head=head.next;
        }
        l.next = b.next;
        r.next = null;
        return a.next;
    }
}