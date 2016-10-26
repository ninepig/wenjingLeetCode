package wenjing.interview.cc150.stackandqueue;

public class BasicStack {

	Node top;
	
	public void push(Object thisData){
		
		top.next = top;
		top = new Node();
		top.data = (int)thisData;
	}
	
	public int pop(){
		if(top!=null){
			int data = top.data;
			top = top.next;
			return data;
			
		}
		return 0;
	}
	
	int peek(){
		return top.data;
	}
	
}
