package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/1/17.
 */
public class SumOfLeftLeaves {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            sum += root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return sum;

    }

}

