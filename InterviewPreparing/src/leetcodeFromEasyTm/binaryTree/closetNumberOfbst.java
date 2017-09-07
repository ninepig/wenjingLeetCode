package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/6.
 */
public class closetNumberOfbst {


    double min = Integer.MAX_VALUE;
    int closedValue;

    public int closestValue(TreeNode root, double target) {
        dfs(root,target);
        return closedValue;

    }

    private void dfs(TreeNode root, double target) {
        if(root==null){
            return;
        }
        if (Math.abs(root.val-target)<min){
            min = Math.abs(root.val-target);
            closedValue = root.val;
        }
        dfs(root.left,target);
        dfs(root.right,target);

    }
}
