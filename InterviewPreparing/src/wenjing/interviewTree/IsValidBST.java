package wenjing.interviewTree;

import java.util.ArrayList;

/*http://blog.csdn.net/linhuanmars/article/details/23810735
 * 判断一课树是否 搜索二叉树
 * 第一种方法，利用BST的原理，是一课树的中序排列，按照中序遍历一下这棵二叉树，如果是出来的是递增，则是合法的，要利用一个前驱节点去保存前一个的值（因为JAVA值传递的问题，所以用一个变量的数组去保存前驱节点）
 *第一种方法写的太优雅了，完全是琢磨透了二叉搜索树的原理，结构
 *
 *第二种方法则是根据题意来解答的，二叉搜索树的某一个节点一定比左子节点大，比右节点小，所以就给了二叉查询树某一个节点一个左右边界，递归下去
 *
 */
public class IsValidBST {

	public boolean solutionFrist(BinaryNode<T> treeNode){
		
		ArrayList<Integer> pre = new ArrayList<>();
		
		pre.add(null);
		
		return help(treeNode,pre);
		
							
		
	}

	private boolean help(BinaryNode<T> treeNode, ArrayList<Integer> pre) {
		// TODO Auto-generated method stub
		if(treeNode == null){
			return false;
		}
		boolean left = help(treeNode.leftChild,pre);
		
		//如果当前节点的值小前驱的结点，则说明不符合BST
		if(pre.get(0) != null && treeNode.getData()<pre.get(0) ){
			return false;
		}
		pre.set(0, treeNode.getData());
	
		return left && help(treeNode.rightChild,pre);
	}
	
	
	public boolean solutionSecond(BinaryNode<T> treeNode){
		
		
		return helpSecond(treeNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		
	}

	private boolean helpSecond(BinaryNode<T> treeNode, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(treeNode == null){
			return false;
		}
		
		if(treeNode.getData()<= minValue || treeNode.getData()>=maxValue){
			return false;
		}
		
		return helpSecond(treeNode.leftChild, minValue, treeNode.getData())&&helpSecond(treeNode.rightChild,treeNode.getData(),maxValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
