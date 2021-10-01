package Assignment3;

public class Q4 {

    // Time complexity: O(N);
    // Space complexity: O(1);
    public ListNode oddEvenList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode odd = head, even = head.next;
        ListNode evenHead = even;
        while (odd != null && even != null && even.next != null){
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        odd.next = evenHead;
        return head;
    }
}
