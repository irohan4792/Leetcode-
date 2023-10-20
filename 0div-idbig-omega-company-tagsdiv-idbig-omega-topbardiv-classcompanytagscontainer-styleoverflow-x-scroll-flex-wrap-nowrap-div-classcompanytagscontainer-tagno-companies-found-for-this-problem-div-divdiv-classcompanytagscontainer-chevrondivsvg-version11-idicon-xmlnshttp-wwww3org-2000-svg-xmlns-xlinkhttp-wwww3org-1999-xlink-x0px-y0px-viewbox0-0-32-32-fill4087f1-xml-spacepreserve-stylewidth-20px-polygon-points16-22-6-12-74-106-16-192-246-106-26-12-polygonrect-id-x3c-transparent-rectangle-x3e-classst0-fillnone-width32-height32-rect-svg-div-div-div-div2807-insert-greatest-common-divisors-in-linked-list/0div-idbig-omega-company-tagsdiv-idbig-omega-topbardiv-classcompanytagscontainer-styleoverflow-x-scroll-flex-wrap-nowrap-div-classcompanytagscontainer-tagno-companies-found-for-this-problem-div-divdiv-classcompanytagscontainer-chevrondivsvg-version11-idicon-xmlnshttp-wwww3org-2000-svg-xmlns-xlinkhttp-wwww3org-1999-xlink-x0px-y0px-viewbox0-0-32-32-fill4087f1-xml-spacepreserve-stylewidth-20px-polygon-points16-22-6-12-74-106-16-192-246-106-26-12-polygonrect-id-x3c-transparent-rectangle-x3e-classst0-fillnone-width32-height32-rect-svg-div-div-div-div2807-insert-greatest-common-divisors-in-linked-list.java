class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next!=null){
            ListNode newnode = new ListNode(gcdfind(cur.val, cur.next.val), cur.next);
            cur.next = newnode;
            cur = newnode.next;
        }
        return head;
    }
    int gcdfind(int a, int b) {
        if (b == 0) return a;
        return gcdfind(b, a % b);
    }
}
