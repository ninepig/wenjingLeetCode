package wenjing.interviewTree;

/*
 * 用的是code ganker大神的方法，把数组的中间点，当做binarytree的根节点，然后左边的子数组的中间点是左边子树的中间点，右边也是如此，递归的方法就可以了。
 * 因为binarysearchtree 对于sorted的数组，中间点就是tree的根节点。
 */
public class SortedArrayToBinarySearchTree {

	public BinaryNode<T> help(int[] sortedArray, int leftSide, int rightSide){
		
		if(leftSide>rightSide){
		return null;
		} 
		
		int middlePoint = (leftSide+rightSide)/2;
		//以这个middlepoint的value 创建root
		BinaryNode<T> rootNode = new BinaryNode<T>(sortedArray[middlePoint]);
		rootNode.leftChild = help(sortedArray,0,middlePoint);
		rootNode.rightChild = help(sortedArray,middlePoint+1,rightSide);
		
		return rootNode;
	}
	
	public BinaryNode<T> sortedMethod(int[] sortedArray){
		
		BinaryNode<T> rootNode;
		
		if(sortedArray == null || sortedArray.length ==0){
			return null;
		}
		rootNode = help(sortedArray,0,sortedArray.length-1);
		return rootNode;
	}
	
	
	
}
