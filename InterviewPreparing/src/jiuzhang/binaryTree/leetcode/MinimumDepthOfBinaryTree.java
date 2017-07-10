package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/4/17.
 */
public class MinimumDepthOfBinaryTree {


    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }

        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }

}
