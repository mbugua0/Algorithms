/*
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class ReverseLinkedList2 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		ListNode prev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
	}
}
