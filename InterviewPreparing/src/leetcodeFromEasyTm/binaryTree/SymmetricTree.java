package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/6.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }

        return dfs(root.left,root.right);

    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return  true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }

        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
