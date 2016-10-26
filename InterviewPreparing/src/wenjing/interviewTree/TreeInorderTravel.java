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
	
	// һ��stack һ�������arraylist���������ڵ㣬�����ջ����û����ڵ��ʱ�� pop���� �����������У�Ȼ���ٿ��ҽڵ㣬������֤��Զ����ڵ����ȡ�

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
