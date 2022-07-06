package leetCodeSolution;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test Case
		 * L1: [2,4,9] L2: [5,6,4,9]
		 * L1: [5] L2:[5]
		 */
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(9);
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        list2.next.next.next = new ListNode(9);
		ListNode result = addTwoNumbers(list1, list2);
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		System.out.println(result.next.next.next.val);
		System.out.println(result.next.next.next.next.val);
	}

	public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 == null) {
			if(list2.val<=9) {
				ListNode add = new ListNode(list2.val);
				System.out.println("A1 " + add.val);
				add.next = addTwoNumbers(null, list2.next);
				return add;
			}
			else {
				ListNode add = new ListNode(list2.val % 10 );
				System.out.println("A2 " + add.val);
				ListNode one = new ListNode(1);
				add.next = addTwoNumbers(one, list2.next);
				return add;
			}

		}
		if (list2 == null) {
			if(list1.val<=9) {
				ListNode add = new ListNode(list1.val);
				System.out.println("B1 " + add.val);
				add.next = addTwoNumbers(list1.next, null);
				return add;
			}
			else {
				ListNode add = new ListNode(list1.val % 10);
				System.out.println("B2 " + add.val);
				ListNode one = new ListNode(1);
				add.next = addTwoNumbers(list1.next, one);
				return add;
			}		
		}
		if (list1.val + list2.val <= 9) {
			ListNode add = new ListNode(list1.val + list2.val);
			System.out.println("C " + add.val);
			add.next = addTwoNumbers(list1.next, list2.next);
			return add;
		} else {
			ListNode add = new ListNode((list1.val + list2.val) % 10);
			if(list1.next==null && list2.next==null) {
				ListNode one = new ListNode(1);
				add.next = addTwoNumbers(one, null);
				return add;
			}
			else if(list1.next==null) {
				list2.next.val +=1;
				add.next = addTwoNumbers(null, list2.next);
				System.out.println("list 1 null");
				return add;
			}
			else if(list2.next==null) {
				list1.next.val +=1;
				add.next = addTwoNumbers(list1.next, null);
				System.out.println("list 2 null");
				return add;
			}
			else {
				list1.next.val +=1;
				add.next = addTwoNumbers(list1.next, list2.next);
				System.out.println("list 1 & 2 not null");
				return add;
			}			
		}
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
