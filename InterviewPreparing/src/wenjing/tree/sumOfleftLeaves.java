package wenjing.tree;

/**
 * Created by yamengwenjing on 2017-02-25.
 */
public class sumOfleftLeaves {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    public int sumOfLeftLeaves(TreeNode root) {
            if(root==null){
                return  0;
            }
            if(root.left!=null&&root.left.left==null&&root.left.right==null){
                return root.left.val+sumOfLeftLeaves(root.right);
            }else {
                return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
            }

    }
}
