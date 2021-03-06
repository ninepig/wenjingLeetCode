package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/2.
 */
public class convertBstToAGreaterTree {

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {

        helper(root);

        return root;
    }

    private void helper(TreeNode root) {
            if(root==null){
                return;
            }
            helper(root.right);
            root.val += sum;
            sum = root.val;
            helper(root.left);
    }

}
