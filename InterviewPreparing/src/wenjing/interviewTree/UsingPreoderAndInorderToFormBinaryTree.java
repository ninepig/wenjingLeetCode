package wenjing.interviewTree;

import java.util.HashMap;

/*
 * http://blog.csdn.net/linhuanmars/article/details/24389549
 * 画一个前序和中序的图，通过前序的数组可以得到根节点的位置，通过这个根节点的值在中序中可以获得左右子树，左子树在前序之中又可以分，第一个节点为根节点，形成递归。
 * 用一个hashmap来保存中序的值，index序列。
 * 关键是想明白递归中，左右子树的preOder的数组index位置，利用index
 */
public class UsingPreoderAndInorderToFormBinaryTree {

	public BinaryNode<T> solution(int[] preOrder,int[] inOrder){
		if(preOrder != null && inOrder != null){
			return null;
		}
		HashMap<Integer, Integer> inOrderMap = new HashMap<>();
		for(int i = 0; i<inOrder.length;i++){
			inOrderMap.put(inOrder[i], i);
		}
		BinaryNode<T> root;
		
		root = help(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1,inOrderMap);
		
		return root;
		
		
	}

	private BinaryNode<T> help(int[] preOrder, int preOrderL, int preOrderR, int[] inOrder, int inOrderL, int inOrderR,
			HashMap<Integer, Integer> inorderKeyMap) {
		// TODO Auto-generated method stub
		if(preOrderL>preOrderR||inOrderL>inOrderR){
			return null;
		}
		BinaryNode<T> rootNode = new BinaryNode<>(preOrder[preOrderL]);
		
		int rootNodeIndexInInorder = inorderKeyMap.get(preOrder[inOrderL]);
		
		rootNode.leftChild = help(preOrder,preOrderL+1,rootNodeIndexInInorder-inOrderL+preOrderL,inOrder,inOrderL,rootNodeIndexInInorder-1,inorderKeyMap);

		rootNode.rightChild = help(preOrder, preOrderL+rootNodeIndexInInorder-inOrderL-1, preOrderR, inOrder,rootNodeIndexInInorder+1, inOrderR, inorderKeyMap);
		
		
		return rootNode;
	}
	
	
	
}
