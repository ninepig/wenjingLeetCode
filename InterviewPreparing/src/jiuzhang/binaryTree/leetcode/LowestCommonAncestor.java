package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/3/17.
 */
public class LowestCommonAncestor {
    /*
    基本功的问题， 因为是要递归，所以要直接return 递归的结果
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return root;
        }

        if (root.val < p.val && root.val < q.val) {
            // wrong version . if you dont return it. it will do nothing there!
//            lowestCommonAncestor(root.right, p, q);
           root = lowestCommonAncestor(root.right, p,  q);
        }
        if (root.val > p.val && root.val > q.val) {

            root = lowestCommonAncestor(root.left, p, q);
        }
        return root;

    }




}
