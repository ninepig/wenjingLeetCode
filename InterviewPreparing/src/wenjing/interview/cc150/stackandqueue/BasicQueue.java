package wenjing.interview.cc150.stackandqueue;

public class BasicQueue {
	Node first,last;
	
	public void inQueue(int thisData){
		if(first== null){
			
			last = new Node();
			last.data =thisData;
			first =last;
		}
		else{
				Node newLast = new Node();
				newLast.data = thisData;
				last.next = newLast;
				
	}
		
	}
	
	public int deQueue(){
		if(first == null){
			return 0;
		}
		int  data = first.data;
		first = first.next;
		return data;
	}
	
	
	
}
