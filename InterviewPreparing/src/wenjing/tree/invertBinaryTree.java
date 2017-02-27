package wenjing.tree;

/**
 * Created by yamengwenjing on 2017-02-22.
 *
 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class invertBinaryTree {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root ==  null){
            return root;
        }
        TreeNode tempNode = root.left;
        root.left =root.right;
        root.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);

        return  root;
    }





}


