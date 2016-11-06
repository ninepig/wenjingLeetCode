package wenjing.LeetCode;
/*
 * Find the sum of all left leaves in a given binary tree.
 */
public class LeetCode404 {
	
		//自己的思路没错，递归就是找结束态，剩下的都丢给递归去完成就行了，不能浅尝辄止啊！兄弟
			
		//对于结束条件，如果节点为空，则返回0 
	//某一个节点的左节点不为null，这个左节点没有子节点，则返回这个节点和右节点的左节点和
	//其他情况下，递归找左节点即可。
	public int sumOfLeftLeaves(TreeNode root) {
			if(root == null){
				return 0;
			}
			if(root.left!=null&&root.left.left==null&&root.left.right==null){
				return root.left.val+sumOfLeftLeaves(root.right);
			}else{
				return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
			}
		  
		  
	    }
}
