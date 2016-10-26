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
	
	// ǰ����������Ը��ڵ�����Ҫ���������������������ڵ�Ϊ���ڵ��ʱ��������������
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
