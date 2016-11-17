package wenjing.LeetCode;

/**
 * Created by yamengwenjing on 2016-11-15.
 */
public class LeetCode101 {
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
}
