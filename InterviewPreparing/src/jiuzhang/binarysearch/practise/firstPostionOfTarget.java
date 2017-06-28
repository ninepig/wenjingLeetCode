package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/21.
 *  * Created by yangw on 2017/6/13.
 *For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.

 If the target number does not exist in the array, return -1.
 Example
 If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.
 */
public class firstPostionOfTarget {

    public int binarySearch(int[] nums, int target) {

        if(nums==null||nums.length==0){
            return -1;
        }
        int start = 0,end = nums.length-1;

        while (start+1<end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                end = mid;
            }else if(nums[mid]<target){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(nums[start]==target){
            return start;
        }else if(nums[end]==target){
            return end;
        }else{
            return -1;
        }

    }

}
