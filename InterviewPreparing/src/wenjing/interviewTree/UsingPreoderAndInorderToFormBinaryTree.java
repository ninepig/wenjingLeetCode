//package wenjing.interviewTree;
//
//import java.util.HashMap;
//
///*
// * http://blog.csdn.net/linhuanmars/article/details/24389549
// * ��һ��ǰ��������ͼ��ͨ��ǰ���������Եõ����ڵ��λ�ã�ͨ��������ڵ��ֵ�������п��Ի��������������������ǰ��֮���ֿ��Է֣���һ���ڵ�Ϊ���ڵ㣬�γɵݹ顣
// * ��һ��hashmap�����������ֵ��index���С�
// * �ؼ��������׵ݹ��У�����������preOder������indexλ�ã�����index
// */
//public class UsingPreoderAndInorderToFormBinaryTree {
//
//	public BinaryNode<T> solution(int[] preOrder,int[] inOrder){
//		if(preOrder != null && inOrder != null){
//			return null;
//		}
//		HashMap<Integer, Integer> inOrderMap = new HashMap<>();
//		for(int i = 0; i<inOrder.length;i++){
//			inOrderMap.put(inOrder[i], i);
//		}
//		BinaryNode<T> root;
//
//		root = help(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1,inOrderMap);
//
//		return root;
//
//
//	}
//
//	private BinaryNode<T> help(int[] preOrder, int preOrderL, int preOrderR, int[] inOrder, int inOrderL, int inOrderR,
//			HashMap<Integer, Integer> inorderKeyMap) {
//		// TODO Auto-generated method stub
//		if(preOrderL>preOrderR||inOrderL>inOrderR){
//			return null;
//		}
//		BinaryNode<T> rootNode = new BinaryNode<>(preOrder[preOrderL]);
//
//		int rootNodeIndexInInorder = inorderKeyMap.get(preOrder[inOrderL]);
//
//		rootNode.leftChild = help(preOrder,preOrderL+1,rootNodeIndexInInorder-inOrderL+preOrderL,inOrder,inOrderL,rootNodeIndexInInorder-1,inorderKeyMap);
//
//		rootNode.rightChild = help(preOrder, preOrderL+rootNodeIndexInInorder-inOrderL-1, preOrderR, inOrder,rootNodeIndexInInorder+1, inOrderR, inorderKeyMap);
//
//
//		return rootNode;
//	}
//
//
//
//}
