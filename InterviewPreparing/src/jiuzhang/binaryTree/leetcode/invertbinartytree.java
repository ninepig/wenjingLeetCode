package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 6/30/17.
 */

/*
是一道遍历题，对于当前点，空，返回空，不是空，交换左右点，然后对左点操作，右点操作
 */
public class invertbinartytree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.left);
        invertTree(root.right);
        return root;

    }
}
