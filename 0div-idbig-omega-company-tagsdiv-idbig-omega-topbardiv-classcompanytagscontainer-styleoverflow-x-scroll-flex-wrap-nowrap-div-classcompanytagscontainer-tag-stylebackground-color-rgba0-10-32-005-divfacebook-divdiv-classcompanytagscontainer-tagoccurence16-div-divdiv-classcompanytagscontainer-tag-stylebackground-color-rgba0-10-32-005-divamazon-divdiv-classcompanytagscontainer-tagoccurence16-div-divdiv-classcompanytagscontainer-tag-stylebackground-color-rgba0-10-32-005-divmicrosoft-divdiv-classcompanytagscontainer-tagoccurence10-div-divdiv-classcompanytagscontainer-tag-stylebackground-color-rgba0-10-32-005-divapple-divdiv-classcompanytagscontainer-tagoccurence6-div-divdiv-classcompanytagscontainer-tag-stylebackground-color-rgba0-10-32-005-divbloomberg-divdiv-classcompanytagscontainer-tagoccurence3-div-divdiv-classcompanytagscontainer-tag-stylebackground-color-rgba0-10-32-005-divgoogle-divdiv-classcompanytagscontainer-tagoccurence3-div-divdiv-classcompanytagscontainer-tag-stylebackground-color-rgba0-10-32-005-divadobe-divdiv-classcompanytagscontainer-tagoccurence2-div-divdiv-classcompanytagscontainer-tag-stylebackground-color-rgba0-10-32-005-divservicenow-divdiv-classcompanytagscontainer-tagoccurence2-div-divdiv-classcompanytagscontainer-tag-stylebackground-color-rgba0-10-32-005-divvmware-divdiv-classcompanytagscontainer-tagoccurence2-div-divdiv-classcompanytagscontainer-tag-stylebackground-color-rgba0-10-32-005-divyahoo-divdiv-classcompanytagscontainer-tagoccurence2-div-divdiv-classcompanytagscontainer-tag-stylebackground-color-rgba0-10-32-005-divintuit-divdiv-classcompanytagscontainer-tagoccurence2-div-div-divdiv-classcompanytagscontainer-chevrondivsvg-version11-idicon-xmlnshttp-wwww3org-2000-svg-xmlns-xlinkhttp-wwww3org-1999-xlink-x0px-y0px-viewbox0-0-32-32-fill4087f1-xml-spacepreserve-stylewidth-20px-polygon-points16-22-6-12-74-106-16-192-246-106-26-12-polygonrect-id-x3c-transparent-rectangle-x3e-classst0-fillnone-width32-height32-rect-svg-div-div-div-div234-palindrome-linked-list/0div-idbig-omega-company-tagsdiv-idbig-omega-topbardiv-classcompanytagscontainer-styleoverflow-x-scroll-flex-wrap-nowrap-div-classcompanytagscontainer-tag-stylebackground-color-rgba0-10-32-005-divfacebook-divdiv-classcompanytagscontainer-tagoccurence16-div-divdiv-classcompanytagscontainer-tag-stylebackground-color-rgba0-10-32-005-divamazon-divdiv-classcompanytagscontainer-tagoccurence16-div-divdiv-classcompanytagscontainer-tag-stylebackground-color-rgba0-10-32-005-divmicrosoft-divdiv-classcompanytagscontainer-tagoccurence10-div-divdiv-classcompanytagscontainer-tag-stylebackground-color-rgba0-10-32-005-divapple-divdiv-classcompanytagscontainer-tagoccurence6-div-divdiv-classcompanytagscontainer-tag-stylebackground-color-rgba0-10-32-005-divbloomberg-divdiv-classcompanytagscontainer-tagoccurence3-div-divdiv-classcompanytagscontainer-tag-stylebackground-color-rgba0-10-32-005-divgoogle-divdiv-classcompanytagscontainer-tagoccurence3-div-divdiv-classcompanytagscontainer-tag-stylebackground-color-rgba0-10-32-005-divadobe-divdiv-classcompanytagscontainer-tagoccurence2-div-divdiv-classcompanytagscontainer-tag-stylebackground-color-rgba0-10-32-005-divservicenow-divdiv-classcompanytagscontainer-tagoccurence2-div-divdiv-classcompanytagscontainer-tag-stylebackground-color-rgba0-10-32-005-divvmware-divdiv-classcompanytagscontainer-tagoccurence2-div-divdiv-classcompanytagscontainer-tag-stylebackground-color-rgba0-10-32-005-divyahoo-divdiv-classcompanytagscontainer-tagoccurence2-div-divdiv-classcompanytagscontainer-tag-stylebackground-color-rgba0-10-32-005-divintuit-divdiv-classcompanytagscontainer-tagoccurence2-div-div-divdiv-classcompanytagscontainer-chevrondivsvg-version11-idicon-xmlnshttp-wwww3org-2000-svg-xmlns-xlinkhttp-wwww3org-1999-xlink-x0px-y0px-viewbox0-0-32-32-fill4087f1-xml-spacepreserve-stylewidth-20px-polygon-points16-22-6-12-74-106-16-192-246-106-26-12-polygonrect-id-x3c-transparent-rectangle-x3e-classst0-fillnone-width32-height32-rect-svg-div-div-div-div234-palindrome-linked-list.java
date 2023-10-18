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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next; 
        }
        int l = 0;
        int r = al.size()-1;
        while(l<=r){
            if(al.get(l)!=al.get(r)) return false;
            l++;
            r--;
        }
        return true;
        
    }
}