package LinkedList;

public class Q2_6CircularBeginning {

	LinkedListNode FindBeginning(LinkedListNode head){
		LinkedListNode slow= head;
		LinkedListNode fast = head;
		//Find meeting point, this will be LOOP_SIZE-k steps into the linked list
		while(fast!=null &&fast.next!=null){
			slow= slow.next;
			fast = fast.next.next;
			if(slow==fast){
				//collision
				break;
			}
		}
		//Error check-no meeting point, and therefore no loop
		if(fast==null||fast.next==null){
			return null;
		}
		//Move slow to head. keep fast at meeting point. Each are k steps from the loop start. If they move at the same pace, they must meet at loop start
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast = fast.next;
		}
		//both now point to the start of the loop
		return fast;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
