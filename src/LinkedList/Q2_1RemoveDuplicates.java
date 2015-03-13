package LinkedList;

import java.util.HashMap;

public class Q2_1RemoveDuplicates {
	public static void removeDupe1(LinkedListNode n){
		HashMap map = new HashMap();
		LinkedListNode previous = null;
		while(n!=null){
			//runner and previous
			if(map.containsKey(n.data)){
				previous.next=n.next;
			}else{
				map.put(n.data, true);
				previous=n;   
			}
			n=n.next;
		}
	}
public static void removeDupe2(LinkedListNode head){
	if(head==null)return ;
	LinkedListNode current = head;
	while(current.next!=null){
		LinkedListNode runner = current;
		while(runner.next!=null){
			if(runner.next.data==current.data){
				runner.next=runner.next.next;
			}else{
				runner=runner.next;
			}
		}
		current=current.next;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
