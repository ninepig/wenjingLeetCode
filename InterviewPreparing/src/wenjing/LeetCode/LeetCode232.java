package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class LeetCode232 {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	 // Push element x to the back of queue.
    public void push(int x) {
        
    	stack1.push(x);
    	
    }

    // Removes the element from in front of queue.
    public void pop() {
    	shiftStack();
    	stack2.pop();
    	
    }

    public void shiftStack(){
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    		
    	}
    	
    }
    
    // Get the front element.
    public int peek() {
    	shiftStack();
    	return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
	
}
