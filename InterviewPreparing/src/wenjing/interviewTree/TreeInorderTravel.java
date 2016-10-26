package wenjing.interviewTree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeInorderTravel {
	
	
	
	public void inorderTravelRec(BinaryNode<T> root){
		
		if(root != null){		
			inorderTravelRec((BinaryNode<T>) root.getLeftChild());
			System.out.println(root.getData());
			inorderTravelRec((BinaryNode<T>) root.getRightChid());		
			
		}
	}
	
	// 一个stack 一个结果的arraylist，如果有左节点，则加入栈，当没有左节点的时候 pop出来 加入结果队列中，然后再看右节点，这样保证永远是左节点最先。

	public void inorderTravelStack(BinaryNode<T> root){
		
		Stack<BinaryNode<T>> nodeStack = new Stack<>();
		ArrayList<BinaryNode<T>> resultArray = new ArrayList<>();
		
		while((root!=null)||!nodeStack.isEmpty()){
			
			if(root!=null){
				
				nodeStack.push(root);
				root = (BinaryNode<T>) root.getLeftChild();
				
			}else{
				root = nodeStack.pop();
				resultArray.add(root);
				root =(BinaryNode<T>) root.getRightChid();
				
				
			}
		
		}
		
		
		
		
		
		
	}
	

}
