package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/4/17.
 */
public class pathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }

        return helper(root,sum);

    }

    private boolean helper(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left==null&&root.right==null&&sum==root.val){
            return true;
        }

        return helper(root.left,sum-root.val)||helper(root.right,sum-root.val);
    }
}
