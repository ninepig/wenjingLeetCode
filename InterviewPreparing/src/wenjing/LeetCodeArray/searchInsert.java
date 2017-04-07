package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2017-03-21.
 */
public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0||nums==null){
            return 0;
        }
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }else if(nums[i]>target){
                return i;
            }else {
                continue;
            }
        }
        return nums.length;
    }

    public int searchInsertBinary(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
