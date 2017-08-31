package jiuzhang.Array;

import java.util.Arrays;

/**
 * Created by yangw on 2017/8/29.
 */
public class findUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;

        boolean allBigger = true;
        for(int i = 0 ; i < nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    allBigger = false;
                    break;
                }
            }
            if (!allBigger){
                break;
            }else {
                l++;
            }
        }
        boolean allSmaller = true;
        for(int i = nums.length-1;i>=0;i--){
            for(int j = i-1;j>=0;j--){
                if(nums[i]<nums[j]){
                    allSmaller = false;
                    break;
                }
            }
            if (!allSmaller){
                break;
            }else {
                r--;
            }
        }

        if(l>=r){
            return 0;
        }

        return r-l+1;

    }

    public int findUnsortedSubarray2(int[] nums){

        int n = nums.length;
        int[] temp = nums.clone();
        Arrays.sort(temp);

        int start = 0;
        while (start < n  && nums[start] == temp[start]) start++;

        int end = n - 1;
        while (end > start  && nums[end] == temp[end]) end--;

        return end - start + 1;

    }
}
