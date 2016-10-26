package wenjing.interview.cc150.stackandqueue;

import java.util.Stack;
//´ÏÃ÷°ì·¨
public class SortingStackAsc {

	Stack<Integer> sorting(Stack<Integer> original){
		
		Stack<Integer> sorted = new Stack<>();
		
		while(!original.isEmpty()){
			int tempValue = original.pop();
			while(!sorted.isEmpty()&&sorted.peek()>tempValue){
				original.push(sorted.pop());
			}
			sorted.push(tempValue);
		}
		
		
		return sorted;
	}
	
	
	
	
}
