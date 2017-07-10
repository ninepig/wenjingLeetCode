package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/4/17.
 */
public class BalancedBinaryTree {


    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }
        helper(root);

        return isBalanced;
    }

    private int helper(TreeNode root) {

        if(root==null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(Math.abs(left-right)>1){
            isBalanced =false;
        }
        return Math.max(left,right)+1;

    }

}
