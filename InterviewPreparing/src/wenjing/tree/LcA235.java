package wenjing.tree;

import wenjing.LeetCode.TreeNode;
/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: ??The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants 
(where we allow a node to be a descendant of itself).??

 */
public class LcA235 {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 	if(root.val<p.val&&root.val<q.val){
		 		return lowestCommonAncestor(root.right, p, q);
		 	}
		 	if(root.val>p.val&&root.val>q.val){
		 		return lowestCommonAncestor(root.left, p, q);

		 	}
		 	return root;
		 
	    }
}
