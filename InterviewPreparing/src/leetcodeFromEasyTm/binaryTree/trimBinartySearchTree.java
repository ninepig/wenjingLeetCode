package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/5.
 */
public class trimBinartySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
            if (root==null){
                return  null;
            }

            if(root.val<L){
                return trimBST(root.right,L,R);
            }
            if (root.val>R){
                return trimBST(root.left,L,R);
            }
            root.left = trimBST(root.left,L,R);
            root.right =trimBST(root.right,L,R);

            return root;

    }
}
