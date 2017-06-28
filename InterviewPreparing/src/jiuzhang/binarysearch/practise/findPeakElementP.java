package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/21.
 */
public class findPeakElementP {
    public int findPeakElement(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int start = 0,end = nums.length-1;
        while (start+1<end){

            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else {
               start =mid;
            }
        }
        if(nums[start]<nums[end]){
            return end;
        }else {
            return start;
        }



    }
}
