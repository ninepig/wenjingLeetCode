package wenjing.interviewTree;

import java.util.LinkedList;

/*
 * ����������������ȣ��ݹ�ķ�����������������С��+1���мǣ���ǳ�ĵ� �����ǵ�һ��Ҷ�ӽڵ����ȣ���������С����ȣ�
 * �ǵݹ飬BFS�ķ���������queueά������node
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
