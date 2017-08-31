package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/8/30.
 */
public class MergeTwoBinartyTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        return mergeTreeHelper(t1,t2);
    }

    private TreeNode mergeTreeHelper(TreeNode t1, TreeNode t2) {
        TreeNode thisNode = new TreeNode(0);

            if(t1==null&&t2==null){
                return null;
            }
            if(t1!=null&&t2==null){
                thisNode = new TreeNode(t1.val);
                thisNode.left = mergeTrees(t1.left,null);
                thisNode.right = mergeTrees(t1.right,null);
            }
            if (t1==null&&t2!=null){
                thisNode = new TreeNode(t2.val);
                thisNode.left = mergeTrees(null,t2.left);
                thisNode.right = mergeTrees(null,t2.right);
            }
            if(t1!=null&&t2!=null){
                thisNode = new TreeNode(t2.val+t1.val);
                thisNode.left = mergeTrees(t1.left,t2.left);
                thisNode.right = mergeTrees(t1.right,t2.right);
            }
        return thisNode;
    }
}
