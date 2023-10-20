// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         if(head==null || head.next==null) return head;
//         ListNode temp = head;
//         ArrayList<Integer> al = new ArrayList<>();
//         while(temp!=null){
//             al.add(temp.val);
//             temp=temp.next;
//         }
//         // System.out.print(al.get(k-1) + " " + al.get(al.size()-k));
//         Collections.swap(al, al.get(k-1), al.get(al.size()-k));
//         ListNode newnode = new ListNode(head.val);
//         int i = 0;
//         while(newnode!=null){
        
//             newnode.val = al.get(i);
//                 i++;
//             newnode=newnode.next;
//         }
//         return newnode;
//     }
// }
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the length of the linked list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Find the first node to be swapped
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find the second node to be swapped
        ListNode second = head;
        for (int i = 1; i <= length - k; i++) {
            second = second.next;
        }

        // Swap the values of the two nodes
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return head;
    }
}
