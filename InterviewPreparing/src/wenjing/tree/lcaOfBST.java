package wenjing.tree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-03-27.
 */
public class lcaOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null){
                return root;
            }

            //不确定是p大于q还是q大于p。。所以要这么做。思路还是对的
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left, p, q);

        }
        return root;



    }
}
