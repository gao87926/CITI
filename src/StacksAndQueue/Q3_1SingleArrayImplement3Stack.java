package StacksAndQueue;

public class Q3_1SingleArrayImplement3Stack {

	class ThreeStack{
		public int stackSize=100;
		int[] buffer = new int[stackSize*3];
		int[] stackPointer={-1,-1,-1};//pointers to track top element
		//return index of top of stack "stackNum", in absolute terms
		int absTopOfStack(int stackNum){
			return stackNum*stackSize+stackPointer[stackNum];
		}
		void push(int stackNum, int value) throws Exception{
			//Check if we have space
			if(stackPointer[stackNum]+1>stackSize){
				throw new Exception("Out of space.");
			}
			//increment stack pointer and then update top value
			stackPointer[stackNum]++;
			buffer[absTopOfStack(stackNum)]=value;
		}
		int pop(int stackNum) throws Exception{
			if(stackPointer[stackNum]==-1){
				throw new Exception("Trying to pop an empty stack");
			}
			int value = buffer[absTopOfStack(stackNum)];//Get top
			buffer[absTopOfStack(stackNum)]=0;//clear stack data at top index
			stackPointer[stackNum]--;//decrement pointer
			return value;
			}
		int peek(int stackNum){
			int index = absTopOfStack(stackNum);
			return buffer[index];
		}
		boolean isEmpty(int stackNum){
			return stackPointer[stackNum]==-1;
		}
	}
	//stackData is a simple class that holds a set of data about each stack, it does not hold the actual items inthe stack
	public class StackData{
		public int start;
		public int pointer;
		public int size=0;
		public int capacity;
		public StackData(int _start, int _capacity){
			start = _start;
		pointer = _start-1;
		capacity=_capacity;
		}
		public boolean isWithinStack(int index, int total_size){
		//note:if stackwraps, the head(right side)wraps around to the left
		if(start <= index&&index<start+capacity){
			//non-wrapping, or "head"(right side) of wrapping case
			return true;
			
 		}else if(start +capacity > total_size && index<(start +capacity)%total_size){
 			//tail(left side) of wrapping case
 			return true;
 		}
		return false;
	}
		
	}
//	public class QuestionB{
//		static int number_of_stacks=3;
//		static int default_size =4;
//		static int total_size = default_size *number_of_stacks;
//		static StackData[] stacks = {new StackData(0, default_size), new StackData(default_size, default_size), new StackData(default_size*2, default_size)};
//		static int[] buffer = new int [total_size];
//		
//		public static void main(String[] args) throws Exception{
//			push(0, 10);
//			push(1,20);
//		
//		}
//		public static int numberOfElements(){
//			return stacks[0].size + stacks[1].size+stacks[2].size;
//		}
//		//CONTINUE
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
