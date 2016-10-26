package wenjing.interview.cc150.stackandqueue;

import java.util.Stack;

public class MyQueueUsingTwoStack {

	Stack<Integer> firstStack ;
	Stack<Integer> SecondStack;
	
	void push(int thisData){
		firstStack.push(thisData);
	}
	
	void shiftStack(){
		// 反转的stack必须是空的才能反转
		if(SecondStack.isEmpty()){
		while(!firstStack.isEmpty()){
			SecondStack.push(firstStack.pop());
		}
		}
	}
	
	int peek(){
		
		shiftStack();
		return SecondStack.peek();
		
	}
	int remove(){
		shiftStack();
		return SecondStack.pop();
	}
	
}
