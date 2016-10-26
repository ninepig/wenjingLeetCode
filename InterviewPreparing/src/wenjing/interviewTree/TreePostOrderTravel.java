package wenjing.interviewTree;

import java.util.ArrayList;
import java.util.Stack;

public class TreePostOrderTravel {

	public  void postOrderTravelFirst(BinaryNode<T> root){
		
		if(root == null){
			return ;
		}
		Stack<BinaryNode<T>> nodeStack = new Stack<>();
		ArrayList<BinaryNode<T>> resultList = new ArrayList<>();
		
		nodeStack.push(root);
		BinaryNode<T> pre = null;
		
		while(!nodeStack.isEmpty()){
			
			BinaryNode<T> current = nodeStack.peek();
			
			if(pre ==null || pre.leftChild == current ||pre.rightChild == current){
				
				if(!pre.hasLeftChild()){
					nodeStack.push(current.leftChild);
				}
				else if(!pre.hasRightChild()){
					nodeStack.push(current.rightChild);
				}else{
					resultList.add(current);
					nodeStack.pop();
				}
			
			if(current.leftChild == pre && current.rightChild!=null){
				nodeStack.push(current.rightChild);
			}
			else{
				resultList.add(current);
				nodeStack.pop();
				
			}
				
				pre = current;
				
			}
	
		}

	}
	
	public  void postOrderTravelSec(BinaryNode<T> root){
		
		
		if(root == null){
			return ;
		}
		Stack<BinaryNode<T>> nodeStack = new Stack<>();
		ArrayList<BinaryNode<T>> resultList = new ArrayList<>();
		
		nodeStack.push(root);
		BinaryNode<T> pre = null;
		
		while(null!=root||!nodeStack.isEmpty()){
			if(null!=root){
				nodeStack.push(root);
				root = root.leftChild;
			}
			else{
				BinaryNode<T> peekNode =nodeStack.peek();
				if(peekNode.rightChild!=null&&peekNode.rightChild!=pre){
					root =peekNode.rightChild;
				}else{
					nodeStack.pop();
					resultList.add(peekNode);
					pre = peekNode;
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
