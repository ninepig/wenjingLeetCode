package wenjing.tree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-03-30.
 */
public class treeDepth {
    public int treeDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);

        return Math.max(leftDepth,rightDepth)+1;
    }
}
