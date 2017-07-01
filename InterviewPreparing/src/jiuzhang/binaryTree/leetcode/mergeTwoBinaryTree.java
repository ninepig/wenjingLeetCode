package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 6/30/17.
 * https://leetcode.com/problems/merge-two-binary-trees/#/description
 *
 *
 */
public class mergeTwoBinaryTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) return null;

        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(val);

        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return newNode;
    }

    /*
    自己的方法一直报空指针，问题应该是出在不应该传一个root进去，因为你用left，right的时候 如果不new那个node出来，你就会报空指针，因为你在用val的时候没有这个root
    同时如果判断了t1 为null 我后面还在用t1的引用 所以造成了空指针呢，必须在每个判断里调用 t1 t2
     */
    /*
    总算做对了。。麻痹 强！
     */
    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {

        if(t1==null&&t2==null){
            return null;
        }
        TreeNode Root = new TreeNode(0);

        return mergeTreeshelper(Root,t1,t2);
    }

    private TreeNode mergeTreeshelper(TreeNode root, TreeNode t1, TreeNode t2) {
            if(t1==null&&t2==null){
                return null;
            }else if(t1==null&&t2!=null){
                root = new TreeNode(t2.val);
                root.left = mergeTreeshelper(root.left,null,t2.left);
                root.right = mergeTreeshelper(root.right,null,t2.right);
            }else if(t2==null&&t1!=null){
                root = new TreeNode(t1.val);
                root.left = mergeTreeshelper(root.left,t1.left,null);
                root.right = mergeTreeshelper(root.right,t1.right,null);

            }else {
                root = new TreeNode(t1.val+t2.val);
                root.left = mergeTreeshelper(root.left,t1.left,t2.left);
                root.right = mergeTreeshelper(root.right,t1.right,t2.right);
            }

            return root;

    }
}
