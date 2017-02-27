//package wenjing.interviewTree;
//
//import java.util.HashMap;
//
///*
// * ��������Ҫ�����ײ��գ����ܻ���������index
// */
//public class UsingInorderAndPostOrderToBinary {
//
//	public BinaryNode<T> solution(int[] postOder, int[] inOrder){
//		if(postOder==null || inOrder==null || postOder.length == 0||inOrder.length == 0){
//			return null;
//		}
//		HashMap<Integer,Integer> inOrderKey = new HashMap();
//		for(int i = 0; i< inOrder.length;i++){
//			inOrderKey.put(inOrder[i], i);
//		}
//
//		BinaryNode<T> rootNode = help(postOder,0,postOder.length-1,inOrder,0,inOrder.length-1,inOrderKey);
//
//
//		return rootNode;
//
//
//
//	}
//
//	private BinaryNode<T> help(int[] postOder, int postOderL, int postOrderR, int[] inOrder, int inOrderL, int inOrderR,HashMap inOrderKey) {
//		// TODO Auto-generated method stub
//		if(postOderL>postOrderR||inOrderL>inOrderR){
//			return null;
//		}
//		BinaryNode<T> rootNode = new BinaryNode<>(postOder[postOrderR]);
//		int rootIndexInInorder = (int) inOrderKey.get(postOder[postOrderR]);
//		rootNode.leftChild = help(postOder,postOderL,postOderL+rootIndexInInorder-inOrderL-1,inOrder,inOrderL,rootIndexInInorder-1,inOrderKey);
//		rootNode.rightChild = help(postOder,postOrderR-(inOrderR-rootIndexInInorder),postOrderR-1,inOrder,rootIndexInInorder+1,inOrderR,inOrderKey);
//
//
//		return rootNode;
//	}
//
//
//}
