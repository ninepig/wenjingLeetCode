package wenjing.tree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-02-27.
 */
public class SameTre {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
