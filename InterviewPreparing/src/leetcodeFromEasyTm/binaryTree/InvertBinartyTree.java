package leetcodeFromEasyTm.binaryTree;

import sun.reflect.generics.tree.Tree;
import wenjing.LeetCode.TreeNode;

import java.util.LinkedList;

/**
 * Created by yangw on 2017/9/1.
 */
public class InvertBinartyTree {
    public TreeNode invertTree(TreeNode root) {
            if(root==null){
                return root;
            }

            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;

            invertTree(root.left);
            invertTree(root.right);

            return root;
    }

    public TreeNode invertTreeLevel(TreeNode root) {
        if (root == null) {
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
        }
        return root;

    }
}
