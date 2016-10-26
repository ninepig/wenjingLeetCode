package wenjing.interview.cc150.stackandqueue;

public class MinStack {

	Node top;
	//这样做不行。。
	int minVaule = 0;
	boolean firstPush = false;
	int stackLength = 0;
	
	void push(int thisData){
		
		if(!firstPush){
			minVaule = thisData;
			firstPush = true;
		}
		
		if(thisData<minVaule){
			minVaule = thisData;
		}
		Node newLast = new Node();
		newLast.data =thisData;
		top.next = top;
		top = newLast;
		stackLength++;
	}
	
	int push(){
		Node popNode = top;
		top = top.next;
		stackLength--;
		return popNode.data;
	}
	
	int min(){
		// check if the stack is empty.
		//maintain a flag to show the length of the stack;
		return minVaule;
	}
}
