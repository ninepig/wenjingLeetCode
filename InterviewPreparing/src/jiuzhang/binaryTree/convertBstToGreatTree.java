package jiuzhang.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/8/23.
 *这道题特别好，给了一个方向 如何用bst 计算子树的sum，
 * 同时给了一个提示，可以先遍历右树，在走左树，这样出来的结果就是从大到小的array
 * 如果要计算sum 应该是 sum+=root.val,但是我们要让当前node+上右侧所有的和，所以变成了 root.val+=sum ,同时维护到目前为止的sum
 */
public class convertBstToGreatTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }

    private void helper(TreeNode root) {
        if (root==null){
            return ;
        }
        helper(root.right);
        root.val+=sum;
        sum = root.val;
        helper(root.left);

    }
}
