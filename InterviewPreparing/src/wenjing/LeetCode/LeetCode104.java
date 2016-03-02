package wenjing.LeetCode;

import java.util.LinkedList;

import wenjing.interviewTree.BinaryNode;
import wenjing.interviewTree.T;

/*
 * leetcode 104
maxDepth tree
�����������ȣ���򵥣���С��Ȼ�Ҫ���ǵ㣩
�ݹ鼴�ɡ���root Ϊ��ʱ���أ������������Ƚ���ģ�1

 */
public class LeetCode104 {
	public int RecursiveSolutions(BinaryNode<T> tree){
		if(tree == null){
			return 0;
		}
		
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
