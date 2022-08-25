package leetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ListNode h4 = new ListNode(1);
//		ListNode h3 = new ListNode(2,h4);
//		ListNode h2 = new ListNode(2,h3);
//		ListNode h1 = new ListNode(1,h2);
		ListNode h1 = new ListNode(1);
		h1.next = new ListNode(2);
		h1.next.next = new ListNode(2);
		h1.next.next.next = new ListNode(2);
		h1.next.next.next.next = new ListNode(1);
		isPalindrome(h1);
//		System.out.println(h1.val);
//		System.out.println(h1.next.val);
//		System.out.println(h1.next.next.val);
//		System.out.println(h1.next.next.next.val);

	}

	public static boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(head.val);
		while (head.next != null) {
			head = head.next;
			list.add(head.val);
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)!=list.get(list.size()-1-i)) {			
				return false;
			}
		}
		return true;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
