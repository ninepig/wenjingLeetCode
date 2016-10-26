package wenjing.interviewTree;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode226 {
	
	// my answer
	 public TreeNode invertTree(TreeNode root) {
	     
		 if(root == null ){
			 return null;
		 }
			 
			 TreeNode tempTreeNode = root.left;
			 root.left = root.right;
			 root.right = tempTreeNode;
			
			 
			 invertTree(root.left);
			 invertTree(root.right);
		
		
			 return root;
		 
		 
	   }

//	 LeetCode simple answer
	 
//	  if(root==null)
//	        return root;
//
//	    TreeNode tmpNode = root.left;
//	    root.left = invertTree(root.right);
//	    root.right = invertTree(tmpNode);
//
//	    return root;

	 
	 //level traversal no recursive 
	 public static TreeNode invertTree1(TreeNode root)  
	 {  
	       if(root == null)  
	        {  
	            return null;  
	        }  
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();  
	        //向列队中添加元素  
	        queue.offer(root);  
	        while(!queue.isEmpty())  
	        {  
	           //获取并移出元素  
	            TreeNode node = queue.poll();  
	            TreeNode left = node.left;  
	            node.left = node.right;  
	            node.right = left;  
	            if(node.left != null)   
	            {  
	                queue.offer(node.left);  
	            }  
	            if(node.right != null)   
	            {  
	                queue.offer(node.right);  
	            }  
	        }  
	        return root;  
	 }  
}
