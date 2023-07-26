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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode zero = new ListNode();
        int st = 1;
        ListNode ans = zero;
        while(temp!=null){
            int res = 0;
            while(temp.val!=0){
                res+=temp.val;
                temp=temp.next;
            }
            if(st==1){
                zero.val=res;
                st=0;
            }
            else{
                zero.next=new ListNode(res);
                zero=zero.next;
            }
            temp=temp.next;
        }
        return ans;

    }
}