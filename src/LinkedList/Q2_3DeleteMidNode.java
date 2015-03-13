package LinkedList;

public class Q2_3DeleteMidNode {
public static boolean deleteNode(LinkedListNode n){
	if(n==null||n.next==null)return false;
	LinkedListNode nextNode = n.next;
	n.data=n.next.data;
	n.next = n.next.next;
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
	LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
//		n1.appendToTail(2);
//		n1.appendToTail(3);
//		n1.appendToTail(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		System.out.println(deleteNode(n3));
		while(n1!=null){
			System.out.println(n1.data);
			n1=n1.next;
		}
	}

}
