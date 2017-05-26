package secondTime;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-05-02.
 */
public class convertSortedArrayTobst {

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums==null||nums.length==0){
            return null;
        }

        return helper(nums,0,nums.length-1);


    }

    private TreeNode helper(int[] nums, int l, int r) {
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode thisNode = new TreeNode(nums[mid]);
        thisNode.left = helper(nums,l,mid);
        thisNode.right = helper(nums,mid+1,r);

        return thisNode;
    }


}



