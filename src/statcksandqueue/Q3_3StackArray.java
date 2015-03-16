package statcksandqueue;

import java.util.ArrayList;
//import java.util.Stack;

public class Q3_3StackArray {

	class SetOfStack{
		int capacity = 0;
		ArrayList<Stack> stacks = new ArrayList<Stack>();
		public Stack getLastStack(){
			if(stacks.size()==0)return null;
			return stacks.get(stacks.size()-1);
			
		}
		public SetOfStack(int capacity){
			this.capacity = capacity;
		}
		public void push(int v){
			Stack last = getLastStack();
			if(last!=null&&!(last.size()>capacity)){
				last.push(v);
			}else{
				//must create new Stack
				Stack stack = new Stack();
				stack.push(v);
				stacks.add(stack);
			}
		}
		public int pop(){
			Stack last = getLastStack();
			int v = (int) last.pop();
			if(last.size()==0)
			{
				stacks.remove(stacks.size()-1);
				
			}
			return v;
		}
		public boolean isEmpty(){
			Stack last  = getLastStack();
			return last==null||last.isEmpty();
		}
		public int popAt(int index){
			return leftShift(index,true);
		}
		public int leftShift(int index, boolean removeTop){
			Stack stack = stacks.get(index);
			int removed_item;
			if(removeTop)removed_item= (int) stack.pop();
			else removed_item= stack.removeBottom();
			if(stack.isEmpty()){
				stacks.remove(index);
			}else if(stacks.size()>index+1){
				int v= leftShift(index+1,false);
				stack.push(v);
			}
			return removed_item;
		}
	}
	public class Stack{
		private int capacity;
		public Object top, bottom;
		public int size = 0;
		public Stack(int capacity){
			this.capacity = capacity;
		}
		public boolean isFull(){
			return capacity ==size;
		}
		public void join(Object above, Object below){
			if(below!=null)below.
		}
		public boolean push(int v){
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
