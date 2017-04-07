package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yamengwenjing on 2016-11-15.
 */
public class symmetricTree {
    //对称树的问题，
    public boolean isSymmetric(TreeNode root) {
        return isMirrored(root,root);
    }
    private boolean isMirrored(TreeNode root1,TreeNode root2){
        /*
        标准结束条件
         */
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        return root1.val==root2.val&&isMirrored(root1.left,root2.right)&&isMirrored(root1.right,root2.left);
    }






    //2017-3-28
    public boolean isSymmetric2(TreeNode root) {
        return isMirror2(root, root);
    }

    private boolean isMirror2(TreeNode root, TreeNode root1) {
        if(root==null&&root1==null){
            return true;
        }
        if(root==null||root1==null){
            return false;
        }
        return (root.val==root1.val)&&isMirror2(root.left,root1.right)&&isMirror2(root.right,root1.left);

    }
    //2017-3-28
    public boolean isSymmetric3(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}
