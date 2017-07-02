package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/2/17.
 */
public class convertSortedArrayToBst {


    /*
    自己的做法 root.val报空指针，因为你把root传下去，这个root是你自己设定的，在递归下去的层数 你并没有一个new出来的node 给root left 或者 root right
    这种生成的 必须在递归之中 new node。
     */
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if(nums==null||nums.length==0){
//            return null;
//        }
//        int start = 0;
//        int end = nums.length-1;
//
//        TreeNode root = new TreeNode(0);
//
//        binarySorthelper(root,start,end,nums);
//        return root;
//    }
//
//    private void binarySorthelper(TreeNode root, int start, int end, int[] nums) {
//
//        if(start>end){
//            return ;
//        }
//        int mid = start+(end-start)/2;
//        root.val = nums[mid];
//        binarySorthelper(root.left,start,mid-1,nums);
//        binarySorthelper(root.right,mid+1,end,nums);
//
//    }
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums==null||nums.length==0){
            return null;
        }
        int start = 0;
        int end = nums.length-1;

        TreeNode root =binarySorthelper(start,end,nums);
        return root;
    }

    private TreeNode binarySorthelper( int start, int end, int[] nums) {

        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode thisNode = new  TreeNode(nums[mid]);
        thisNode.left =  binarySorthelper(start,mid-1,nums);
        thisNode.right = binarySorthelper(mid+1,end,nums);
        return thisNode;
    }



}
