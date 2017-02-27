//package wenjing.interviewTree;
//
///*
// * �õ���code ganker����ķ�������������м�㣬����binarytree�ĸ��ڵ㣬Ȼ����ߵ���������м��������������м�㣬�ұ�Ҳ����ˣ��ݹ�ķ����Ϳ����ˡ�
// * ��Ϊbinarysearchtree ����sorted�����飬�м�����tree�ĸ��ڵ㡣
// */
//public class SortedArrayToBinarySearchTree {
//
//	public BinaryNode<T> help(int[] sortedArray, int leftSide, int rightSide){
//
//		if(leftSide>rightSide){
//		return null;
//		}
//
//		int middlePoint = (leftSide+rightSide)/2;
//		//�����middlepoint��value ����root
//		BinaryNode<T> rootNode = new BinaryNode<T>(sortedArray[middlePoint]);
//		rootNode.leftChild = help(sortedArray,0,middlePoint);
//		rootNode.rightChild = help(sortedArray,middlePoint+1,rightSide);
//
//		return rootNode;
//	}
//
//	public BinaryNode<T> sortedMethod(int[] sortedArray){
//
//		BinaryNode<T> rootNode;
//
//		if(sortedArray == null || sortedArray.length ==0){
//			return null;
//		}
//		rootNode = help(sortedArray,0,sortedArray.length-1);
//		return rootNode;
//	}
//
//
//
//}
