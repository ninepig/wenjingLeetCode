package leetcodeFromEasyTm.binaryTree;

import sun.reflect.generics.tree.Tree;
import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/5.
 */
public class sortedArrayTobst {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null||nums.length==0){
            return  null;
        }
       int l =0;
       int r = nums.length-1;
       TreeNode root =  binarySearch(nums,l,r);

        return root;
    }

    private TreeNode binarySearch(int[] nums,int left, int right) {
      if (left>right){
          return null;
      }
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = binarySearch(nums,left,mid-1);
        root.right =binarySearch(nums,mid+1,right);

        return root;
    }
}
