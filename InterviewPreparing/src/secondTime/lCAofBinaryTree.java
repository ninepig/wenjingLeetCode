package secondTime;

import wenjing.LeetCode.TreeNode;

/**
 * Created by Administrator on 2017/5/10.
 */
public class lCAofBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if(root.val>p.val&&root.val>q.val ){
//                lowestCommonAncestor(root.left,p,q);
//            }
//            if(root.val<p.val&&root.val<q.val){
//                lowestCommonAncestor(root.right,p,q);
//            }
//            return root;
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }


}
