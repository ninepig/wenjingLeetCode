package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/13.
 *For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.

 If the target number does not exist in the array, return -1.
 Example
 If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.
 */

public class firstPostionOfTarget {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums==null||nums.length==0){
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        int mid ;
        while (start+1<end){
            mid = start+(end-start)/2;
            if(nums[mid]==target){
                end = mid;
            }else if(nums[mid]>target){
                end = mid;
            }else {
                start =mid;
            }
        }
        if(nums[start]==target){
            return start;
        }else if(nums[end]==target){
            return end;
        }else {
            return -1;
        }
    }
}
