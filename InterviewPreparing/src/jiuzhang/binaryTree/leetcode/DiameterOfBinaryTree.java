package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/1/17.
 * 牛逼！！靠自己做出来的！！漂亮！
 */
public class DiameterOfBinaryTree {

    int diabmeter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {

        if (root==null){
            return 0;
        }
        diamterHelper(root);
        return diabmeter;
    }

    private void diamterHelper(TreeNode root) {
        if(root==null){
            return ;
        }
        int left = maxDepthHelper(root.left);
        int right = maxDepthHelper(root.right);
        diabmeter = Math.max(left+right,diabmeter);
        diamterHelper(root.left);
        diamterHelper(root.right);

    }

    private int maxDepthHelper(TreeNode root) {

        if(root==null){
            return 0;
        }
        return  Math.max(maxDepthHelper(root.left),maxDepthHelper(root.right))+1;
    }
}
