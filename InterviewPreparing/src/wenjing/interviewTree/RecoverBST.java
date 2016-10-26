package wenjing.interviewTree;

import java.util.ArrayList;

/*
 * 牢记bst的原则，利用一个中序遍历，可以走下整棵树，左小于中小于右，
 * 如果有两个点发生了交换，有两种可能，如果是相邻的两个点，比如1234567 --- 1235467 直接交换这两个点就可以了
 * 如果是1234567---5234167 则需要交换的是第一组52违法数的第一个 和第二组42违法数的第二个
 * 具体的看代码，非常优雅
 */
public class RecoverBST {

	public void solution(BinaryNode<T> root){
		
		ArrayList<Integer> preNode = new ArrayList<>();
		ArrayList<Integer> resultNode = new ArrayList<>();
		preNode.add(null);
		
		help(root,preNode,resultNode);
					
		//找到的两个错误的点，交换
		if(resultNode.size() != 0){
			int temp = resultNode.get(0);
			resultNode.set(0, resultNode.get(1));
			resultNode.set(1, temp);
		}
		
		
	}

	private void help(BinaryNode<T> root, ArrayList<Integer> preNode, ArrayList<Integer> resultNode) {
		// TODO Auto-generated method stub
		
		if(root == null){
			return ;
		}
		help(root.leftChild,preNode,resultNode);
		
		//违法现象
		if(preNode.get(0)!=null && preNode.get(0)>root.getData()){
			//如果是第一个违法点，就是有可能是第一种情况连续的第一个点
			if(resultNode.size()==0){
				resultNode.add(preNode.get(0));
				resultNode.add(root.getData());
			}//如果不是第一个违法点，则加入第二个违法点的后面第二个=[=]bg]元素即可
			else{
				resultNode.set(1, root.getData());
			}
		}
		//把之前的结点设为当前的root bst的基本操作
		preNode.set(0, root.getData());
		help(root.rightChild,preNode,resultNode);
		
	}
	
	
	
}
