package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/21.
 */
public class searchInRotatedArrayP {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }

        int start =0, end = nums.length-1;
        while (start+1<end){
            int mid = start+(end-start)/2;
            if(nums[mid]<nums[end]){
                //要考虑到大于等于 小于等于的情况 如果target<= 或者 大于等于的时候其实是可以的
                if(target>nums[mid]&&target<=nums[end]){
                    start = mid;
                }else {
                    end = mid;
                }
            }else {
                if(target>=nums[start]&&target<=nums[mid]){
                    end = mid;
                }else {
                    start = mid;
                }
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
