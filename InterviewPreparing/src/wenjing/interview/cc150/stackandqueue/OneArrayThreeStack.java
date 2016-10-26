package wenjing.interview.cc150.stackandqueue;

//fixed length
public class OneArrayThreeStack {
	int[] myTarray = new int[30];
	int stackFixedLength = 10;
	int[] stackPointerPosition = {-1,-1,-1};

	int getAbsStackPointer(int stackNumber){
		
		return stackNumber*stackFixedLength+stackPointerPosition[stackNumber-1];
		
	}
	
	void push(int data,int stackNumber) throws Exception{
		
		if(stackNumber >3 || stackNumber <= 0){
			return ;
		}
		//out of stack length
		if(stackPointerPosition[stackNumber-1]>stackFixedLength-1){
			throw new Exception("stack full");
//			return ;
		}
		myTarray[getAbsStackPointer(stackNumber)] = data;
		stackPointerPosition[stackNumber-1]++;
		
	}
	// if stack go to first one(pointer is -1 ) it like pop an empty stack.
	int pop(int stackNumber) throws Exception{
		if(stackNumber >3 || stackNumber <= 0){
			return 0 ;
		}
		
		if(stackPointerPosition[stackNumber-1] == -1){
			throw new Exception("try to pop an empty stack");
		}
		int value = myTarray[getAbsStackPointer(stackNumber)];
		myTarray[getAbsStackPointer(stackNumber)] = 0;
		stackPointerPosition[stackNumber-1]--;
		return value;
	}
	
	int peek(int stackNumber){
		
		return  myTarray[getAbsStackPointer(stackNumber)];
		
	}			
	
}
