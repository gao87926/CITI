package LinkedList;

import java.util.Stack;

public class Q2_7LinkedListPalindrome {
boolean isPalindrome(LinkedListNode head){
	LinkedListNode fast = head;
	LinkedListNode slow = head;
	Stack<Integer> stack=new Stack<Integer>();
	//Push selement from fist half of Linked list onto statck, when fast runner(which 2X fast than slower) reach the end of the linked list, then we now we are at the middle
	while(fast!=null && fast.next!=null){
		stack.push(slow.data);
		slow = slow.next;
		fast= fast.next.next;
		
	}
	//has odd number of elements, so skip the middle element
	if(fast!=null){
		slow=slow.next;
	}
	
	while(slow!=null){
		int top = stack.pop().intValue();
		
		//if value are different, then it's not a palindrome
		if(top!=slow.data){
			return false;
		}
		slow= slow.next;
	}
	return true;
}
class Result{
	Result(LinkedListNode node, boolean result){
		this.node= node;
		this.result = result;
	}
	public LinkedListNode node;
	public boolean result;
}
Result isPalindromeRecurse(LinkedListNode head, int length){
	if(head==null||length ==0){
		return new Result(null,true);
	}else if(length==1){
		return new Result(head.next, true);
	}else if(length==2){
		return new Result(head.next.next, head.data==head.next.data);
	}
	Result res =isPalindromeRecurse(head.next, length-2);
	if(!res.result||res.node==null){
		return res;
	}else{
		res.result= head.data==res.node.data;
		res.node= res.node.next;
		return res;
	}
}
boolean isPalindrom(LinkedListNode head){
	Result p  = isPalindromeRecurse(head, listSize(head));
	return p.result;
}
	private static int listSize(LinkedListNode head) {
	// TODO Auto-generated method stub
		int size = 1;
		while(head!=null){
			size++;
			head=head.next;
		}
		
	return size;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
