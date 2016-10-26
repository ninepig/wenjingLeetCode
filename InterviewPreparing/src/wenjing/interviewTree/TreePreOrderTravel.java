package wenjing.interviewTree;

import java.util.ArrayList;
import java.util.Stack;

public class TreePreOrderTravel {

	public void TreePreOrderTravelRec(BinaryNode<T> root){
		
		if(root!=null){
			System.out.println(root);
			TreePreOrderTravelRec((BinaryNode<T>) root.getLeftChild());
			TreePreOrderTravelRec((BinaryNode<T>) root.getRightChid());
		}
		
	}
	
	// 前序遍历，所以根节点最早要被加入结果队列里，即当这个节点为根节点的时候把他放入队列里
	public void TreePreOrderTravel(BinaryNode<T> root){
	
		Stack<BinaryNode<T>> nodeStack = new Stack();
		ArrayList<Object> resultList = new ArrayList<>();
		
		while(!nodeStack.isEmpty()||root!=null){
			if(root!=null){
				nodeStack.push(root);
				resultList.add(root);
				root = (BinaryNode<T>) root.getLeftChild();
			}else{
				
				root = (BinaryNode<T>) nodeStack.pop();
				root =(BinaryNode<T>) root.getRightChid();
				
			}
		
		}	

	}
}
