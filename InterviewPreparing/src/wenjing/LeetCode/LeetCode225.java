package wenjing.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode225 {

	Queue<Integer> que1 = new ArrayDeque<>();
	
	Queue<Integer> que2 = new ArrayDeque<>();
	
	   // Push element x onto stack.
    public void push(int x) {
        
    	if(que1.isEmpty()){
    		que1.add(x);
    		while(!que2.isEmpty()){
    			
    			que1.add(que2.poll());
    		}
    	}else{
    		que2.add(x);
    		while(!que1.isEmpty()){
    			que2.add(que1.poll());
    		}
    	}
    }
    

    // Removes the element on top of the stack.
    public void pop() {
        if(!que1.isEmpty()){
        	que1.poll();
        }	
    	if(!que2.isEmpty()){
    		que2.poll();
    	}
    }

    // Get the top element.
    public int top() {
    	  if(!que1.isEmpty()){
    		  return que1.peek();
          }	
      	if(!que2.isEmpty()){
      		return que2.peek();
      	}
      	//差点没考虑到，两个队列如果都为空，表示没有值
      	else{
      		return -1;
      	}
    	
    }

    // Return whether the stack is empty.
    public boolean empty() {
        
    	return que1.isEmpty()&&que2.isEmpty();
    	
    }
	
	
}
