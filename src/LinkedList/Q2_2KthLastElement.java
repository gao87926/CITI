package LinkedList;

public class Q2_2KthLastElement {

	public static int nthToLast(LinkedListNode head, int k) {
		if (head == null)
			return 0;
		int i = nthToLast(head.next, k) + 1;
		if (i == k) {
			System.out.println(head.data);

		}
		return i;
	}

	public class IntWrapper {
		public int value = 0;

		public IntWrapper() {
			value = 0;
		}
	}
//NOT WORKING
	public static LinkedListNode nthToLast2(LinkedListNode head, int k,Integer i) {
		if (head == null)
			return null;
		LinkedListNode node = nthToLast2(head.next, k, i);
		i = i + 1;
		if (i == k) {
			System.out.println(head.data);
			return head;
		}
		System.out.println(node.data);
		return node;
	}
	public static LinkedListNode nthToLast3(LinkedListNode head,int k){
		if(k<=0)return null;
		LinkedListNode p1 = head;
		LinkedListNode p2= head;
		//move p2 forwar k nodes into the list
		for(int i =0; i<k-1;i++){
			if(p2==null)return null;
			p2=p2.next;
		}
		if(p2==null)return null;
		//Now move p1 p2 at same speed, when p2 hits the end, p1 wil be at kth last element;
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
//		LinkedListNode n2 = new LinkedListNode(2);
//		LinkedListNode n3 = new LinkedListNode(3);
//		LinkedListNode n4 = new LinkedListNode(4);
		n1.appendToTail(2);
		n1.appendToTail(3);
		n1.appendToTail(4);
		Integer in = 0;
		System.out.println(nthToLast3(n1, 1).data);
	}

}
