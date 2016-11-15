package wenjing.LeetCode;
/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants 
(where we allow a node to be a descendant of itself).”
对于bst来说，他是排序好的，所以如果两个点要找最小的祖先节点，应该是这么考虑的，
如果这两个节点在2叉，那他们的中间节点肯定是中间树，在一叉，只要递归的找到他们最下面的分支就可以了。。换句话说就是找到目标节点在你两侧的最低结点
 */
public class Leetcode235 {
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
