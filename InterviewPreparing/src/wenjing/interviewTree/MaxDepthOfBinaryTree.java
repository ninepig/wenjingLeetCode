package wenjing.interviewTree;

import java.util.LinkedList;

/*
 * 计算二叉树的最大深度，递归的方法，返回左右树最大的+1
 * 非递归，BFS的方法，利用queue维护所有node
 * 
 */
public class MaxDepthOfBinaryTree {

	public int RecursiveSolutions(BinaryNode<T> tree){
		if(tree == null){
			return 0;
		}
//		if(tree.leftChild == null){
//			
//			return RecursiveSolutions(tree.rightChild)+1;
//			
//		}
//		if(tree.rightChild == null){
//			
//			return RecursiveSolutions(tree.leftChild)+1;
//			
//		}
		
		return Math.max(RecursiveSolutions(tree.rightChild), RecursiveSolutions(tree.leftChild))+1;
		
		
	}
	
	
	public int IterativeSolutions(BinaryNode<T> tree){
		
		if(tree == null){
			return 0;
		}
		LinkedList<BinaryNode<T>> nodeQueue = new LinkedList<>();
		nodeQueue.add(tree);
		int currentLevelNode = 1;
		int nextLevelNode = 0;
		int level = 1;
		while(!nodeQueue.isEmpty()){
			BinaryNode<T> thisNode = nodeQueue.poll();
			currentLevelNode--;
			if(thisNode.hasLeftChild()){
				nodeQueue.add(thisNode.leftChild);
				nextLevelNode++;
			}
			if(thisNode.hasRightChild()){
				nodeQueue.add(thisNode.rightChild);
				nextLevelNode++;
			}
			if(currentLevelNode == 0){
				level++;
				currentLevelNode = nextLevelNode;
				nextLevelNode = 0;
			}
		
			
		}
		
		return level;
		
	}
	
	
}
