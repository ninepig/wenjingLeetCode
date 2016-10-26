package wenjing.LeetCode;

import java.util.ArrayList;

/*
 * 维护两个stack，有一个stack存储一个最小值
入栈的时候比较，如果比最小栈的值小，则一次入2个元素
top，就是返回栈顶的元素
出栈的话，如果出栈的元素是最小的元素，则要把最小栈的元素也出了，这时候最小栈倒数第二小的元素就变成最小栈最小的元素了
getmin 就是top最小栈的栈顶

 */
public class LeetCode155 {

	ArrayList<Integer> normalStack = new ArrayList<>();
	ArrayList<Integer> minStack = new ArrayList<>();
	

	  public void push(int x) {
		  normalStack.add(x);
		  if(minStack.isEmpty()||minStack.get(minStack.size()-1)>=x){
			  minStack.add(x);
		  }
	    }

	    public void pop() {
	    	if(normalStack.isEmpty()){
	    	return;
	    	}
    		int elment = normalStack.get(normalStack.size()-1);
	        normalStack.remove(normalStack.size()-1);
	        if((!minStack.isEmpty())&&elment==minStack.get(minStack.size()-1)){
	        	minStack.remove(minStack.size()-1);
	        }
	    }

	    public int top() {
	     
	    	if(!normalStack.isEmpty()){
	    		return normalStack.get(normalStack.size()-1);
	    	}
	    	return 0;
	    	
	    }

	    public int getMin() {
	    	 if(!minStack.isEmpty()){
		        	return minStack.get(minStack.size()-1);
	        }
	    	 return 0;
	    }
	
	
}
