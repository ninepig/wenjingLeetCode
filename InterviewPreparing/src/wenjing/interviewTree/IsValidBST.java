//package wenjing.interviewTree;
//
//import java.util.ArrayList;
//
///*http://blog.csdn.net/linhuanmars/article/details/23810735
// * �ж�һ�����Ƿ� ����������
// * ��һ�ַ���������BST��ԭ����һ�������������У������������һ����ö�����������ǳ������ǵ��������ǺϷ��ģ�Ҫ����һ��ǰ���ڵ�ȥ����ǰһ����ֵ����ΪJAVAֵ���ݵ����⣬������һ������������ȥ����ǰ���ڵ㣩
// *��һ�ַ���д��̫�����ˣ���ȫ����ĥ͸�˶�����������ԭ���ṹ
// *
// *�ڶ��ַ������Ǹ������������ģ�������������ĳһ���ڵ�һ�������ӽڵ�󣬱��ҽڵ�С�����Ծ͸��˶����ѯ��ĳһ���ڵ�һ�����ұ߽磬�ݹ���ȥ
// *
// */
//public class IsValidBST {
//
//	public boolean solutionFrist(BinaryNode<T> treeNode){
//
//		ArrayList<Integer> pre = new ArrayList<>();
//
//		pre.add(null);
//
//		return help(treeNode,pre);
//
//
//
//	}
//
//	private boolean help(BinaryNode<T> treeNode, ArrayList<Integer> pre) {
//		// TODO Auto-generated method stub
//		if(treeNode == null){
//			return false;
//		}
//		boolean left = help(treeNode.leftChild,pre);
//
//		//�����ǰ�ڵ��ֵСǰ���Ľ�㣬��˵��������BST
//		if(pre.get(0) != null && treeNode.getData()<pre.get(0) ){
//			return false;
//		}
//		pre.set(0, treeNode.getData());
//
//		return left && help(treeNode.rightChild,pre);
//	}
//
//
//	public boolean solutionSecond(BinaryNode<T> treeNode){
//
//
//		return helpSecond(treeNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
//
//
//	}
//
//	private boolean helpSecond(BinaryNode<T> treeNode, int minValue, int maxValue) {
//		// TODO Auto-generated method stub
//		if(treeNode == null){
//			return false;
//		}
//
//		if(treeNode.getData()<= minValue || treeNode.getData()>=maxValue){
//			return false;
//		}
//
//		return helpSecond(treeNode.leftChild, minValue, treeNode.getData())&&helpSecond(treeNode.rightChild,treeNode.getData(),maxValue);
//	}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
