package jiuzhang.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/6/26.
 */
public class balancedBinaryTree {
    boolean isBa = true;
    public boolean isBalanced(TreeNode root) {
        depthHelper(root);
        return isBa;

    }

    private int depthHelper(TreeNode root) {

        if(!isBa){
            return -1;
        }
        if(root == null){
            return 0;
        }
        int left = depthHelper(root.left);
        int right = depthHelper(root.right);
        if (Math.abs(left-right)>1){
            isBa = false;
        }
        return Math.max(left,right)+1;

    }

}
