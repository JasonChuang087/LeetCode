package leetCodeSolution;

public class MergeTwoSortedLists {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode result = mergeTwoLists(list1,list2);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
        System.out.println(result.next.next.next.next.val);
        System.out.println(result.next.next.next.next.next.val);		
	}
	
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)	return list2;            
        if(list2==null)	return list1;
        
        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
//    	ListNode head = null;
//    	ListNode current1 = list1;
//    	ListNode current2 = list2;
//        ListNode result = new ListNode();
//    	ArrayList<Integer> nums = new ArrayList<Integer>();
//    	while(list1!=null) {
//    		System.out.println("list1: "+list1.val);
//    		nums.add(list1.val);
//    		list1 = list1.next;  		
//    	}
//    	while(list2!=null) {  	
//    		System.out.println("list2: "+list2.val);
//    		nums.add(list2.val);
//    		list2 = list2.next;
//    	}
//    	Collections.sort(nums);
//    	System.out.println(nums);
//    	int i = 0;
//    	while(i<nums.size()) {
//            result.next = mergeTwoLists(list1,list2);
//            result = result.next;
//    		i++;
//    	}
//    	System.out.println("--------");
//    	System.out.println(result.val);
//    	System.out.println(result.next.val);
//    	System.out.println(result.next.next.val);
//    	System.out.println(result.next.next.next.val);
//    	System.out.println(result.next.next.next.next.val);
//    	System.out.println(result.next.next.next.next.next.val);
//		return result;
    }
    
    public static class ListNode {
    	int val;
    	ListNode next;
    	ListNode() {}
    	ListNode(int val) { this.val = val; }
    	ListNode(int val, ListNode next) { this.val = val; this.next = next; 
    	}
    }

}
