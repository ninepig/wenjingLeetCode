package secondTime;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-04-25.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left=root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
