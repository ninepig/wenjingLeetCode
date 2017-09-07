package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/6.
 */
public class lowestCommonAncester {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null){
                return root;
            }
            if (root.val>p.val&&root.val>q.val){
                //都大于 要是左边啊 兄弟！！
                return lowestCommonAncestor(root.left,p,q);
            }
            if(root.val<p.val&&root.val<q.val){
                return lowestCommonAncestor(root.right,p,q);
            }

            return root;

    }
}
