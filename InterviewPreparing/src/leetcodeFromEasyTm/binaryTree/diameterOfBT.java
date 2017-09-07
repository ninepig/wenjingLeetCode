package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/5.
 */
public class diameterOfBT {

    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        MaxDepthOfRoot(root);

        return max;
    }

    private int MaxDepthOfRoot(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = MaxDepthOfRoot(root.left);
        int right =MaxDepthOfRoot(root.right);
        max = Math.max(max,left+right);

        return Math.max(left,right)+1;
    }

}
