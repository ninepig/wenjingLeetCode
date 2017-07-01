package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/1/17.
 */
public class binaryTreeTilt {

    int tilt = 0;
    public int findTilt(TreeNode root) {

        postOrder(root);

        return tilt;
    }

    private int postOrder(TreeNode root) {
        if (root == null ){
            return 0;
        }
        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);
        tilt += Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}
