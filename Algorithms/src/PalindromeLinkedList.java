/*Given a singly linked list, determine if it is a palindrome.
Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true

Palindrome is an array if read forward or backward is the same

eg 1 2 3 4 4 3 2 1    or  racecarracecar
*/

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		//The fast will be skip one node thus moving double the speed of slow
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		//Reversing slow to the beginning from the middle and moving fast to the middle
		slow = reverse(slow);
		fast = head;
		
		while(slow != null){
			//Compare the node values
			if(slow.val != fast.val){
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;
	}
	
	public ListNode reverse(ListNode head){
		ListNode prev = null;
		
		while(head != null){
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}

}
