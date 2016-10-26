package wenjing.interviewTree;

import java.util.LinkedList;

/*
 * 计算二叉树的最大深度，递归的方法，返回左右树最小的+1，切记，最浅的点 必须是第一个叶子节点的深度！而不是最小的深度！
 * 非递归，BFS的方法，利用queue维护所有node
 * 
 */
public class MinDepthOfBinaryTree {

	
	 public int RecursiveSolution(BinaryNode<T> tree){
		 
		 if(tree == null){
			 return 0;
		 }
		 if(tree.leftChild==null){
			 return RecursiveSolution(tree.rightChild)+1;
		 }
		 if(tree.rightChild == null){
			 return RecursiveSolution(tree.leftChild)+1;
		 }
		 
		 return Math.min(RecursiveSolution(tree.leftChild)+1, RecursiveSolution(tree.rightChild))+1;
		 
	 }
	 
	 
	 public int IterativeSolution(BinaryNode<T> tree){
		 
		 if(tree == null){
			 return 0;
		 }
		 LinkedList<BinaryNode<T>> thisQueue = new LinkedList<>();
		 thisQueue.add(tree);
		 int currNode = 1;
		 int nextNode = 0;
		 int level = 1;
		 
		 while(!thisQueue.isEmpty()){
			 BinaryNode<T> thisNode = thisQueue.poll();
			 currNode--;
			 if(!thisNode.hasLeftChild()&&!thisNode.hasRightChild()){
				 return level;
			 }
			 
			 if(thisNode.hasLeftChild()){
				 thisQueue.add(thisNode.leftChild);
				 nextNode++;
				
			 }
			 if(thisNode.hasRightChild()){
			
				 thisQueue.add(thisNode.rightChild);
				 nextNode++;
			 }
			 if(currNode==0){
				currNode =nextNode;
				nextNode =0;
				level++;
			 }
			 
		 }
	
		 return level;
		 
		 
	 }
	 
	 
	 
}
