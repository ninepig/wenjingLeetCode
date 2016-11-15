package wenjing.LeetCode;
/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: ��The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants 
(where we allow a node to be a descendant of itself).��
����bst��˵����������õģ��������������Ҫ����С�����Ƚڵ㣬Ӧ������ô���ǵģ�
����������ڵ���2�棬�����ǵ��м�ڵ�϶����м�������һ�棬ֻҪ�ݹ���ҵ�����������ķ�֧�Ϳ����ˡ������仰˵�����ҵ�Ŀ��ڵ������������ͽ��
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
