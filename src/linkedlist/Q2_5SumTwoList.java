package linkedlist;

import sun.security.util.Length;

public class Q2_5SumTwoList {
	// 617+295: l1:7->1->6 + 5->9->2
	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2,
			int carry) {
		// we are done if both lists are null AND the carry value is 0
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		LinkedListNode result = new LinkedListNode(0);
		// Add value and the data from l1 and l2
		int value = carry;
		if (l1 != null) {
			value += l1.data;
		}
		if (l2 != null) {
			value += l2.data;
		}
		result.data = value % 10;// Second digit of number
		// recurse
		if (l1 != null || l2 != null) {
			LinkedListNode more = addLists(l1 == null ? null : l1.next,
					l2 == null ? null : l2.next, value >= 10 ? 1 : 0);
			result.next = more;
		}
		return result;
	}

	public class PartialSum{
		public LinkedListNode sum = null;
		public int carry=0;
	}
	//Pad the list with zeros
	LinkedListNode padList(LinkedListNode l, int padding){
		LinkedListNode head=l;
		for(int i=0; i<padding;i++){
			LinkedListNode n = new LinkedListNode(0);
			head.pre =n; 
		}
		
	}
	LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2){
		int len1 = Length(l1);
		int len2 = Length(l2);
		if(len1<len2){
			l1=padList
		}
	}
	private int Length(LinkedListNode l1) {
		int size =1;
		while(l1!=null){
			l1=l1.next;
			size++;
		}
		// TODO Auto-generated method stub
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(7);
		n1.appendToTail(1);
		n1.appendToTail(6);
		LinkedListNode n2 = new LinkedListNode(5);
		n2.appendToTail(9);
		n2.appendToTail(2);
		LinkedListNode curr = addLists(n1, n2, 0);
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}
