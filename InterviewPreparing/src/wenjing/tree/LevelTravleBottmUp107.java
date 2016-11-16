package wenjing.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import wenjing.LeetCode.TreeNode;

/*
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).


 */
	public class LevelTravleBottmUp107 {
	//����������߼���cracker�Ļ�Ҫ�������ǳ���
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			//����߼�����Ҫ���ǵ�
	    if(root ==null){
	    	return new ArrayList<>();
	    }
		
	    List<List<Integer>> resultList = new ArrayList<>();
		
		LinkedList<TreeNode> nodeQueue = new LinkedList<>();
		
		nodeQueue.add(root);
		
		while(!nodeQueue.isEmpty()){
			
			int currentLevelSize = nodeQueue.size();
			List<Integer> thisLevelResult = new ArrayList<>();
			
			for(int i = 0; i<currentLevelSize;i++){
				TreeNode currentNode = nodeQueue.pop();
				thisLevelResult.add(currentNode.val);
				
				if(currentNode.left!=null){
					nodeQueue.offer(currentNode.left);
				}
				if(currentNode.right!=null){
					nodeQueue.offer(currentNode.right);
				}
				
			}
			resultList.add(0,thisLevelResult);
			
			
		}
		
		
		return resultList;
		
		
		
		
	    }
	}
