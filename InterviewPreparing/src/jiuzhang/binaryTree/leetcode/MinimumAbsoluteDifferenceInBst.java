package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 6/30/17.
 */
public class MinimumAbsoluteDifferenceInBst {

    /**
     * 看题又不认真啊。。这是个bst！！
     * @param root
     * @return
     */

    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {

        if(root == null){
            return min;
        }
        getMinimumDifference(root.left);
        if(prev != null){
            min = Math.min(min,root.val-prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);

        return min;
    }
}
