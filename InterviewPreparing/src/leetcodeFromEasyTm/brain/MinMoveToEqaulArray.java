package leetcodeFromEasyTm.brain;

import java.util.Arrays;

/**
 * Created by yangw on 2017/9/2.
 */
public class MinMoveToEqaulArray {
    public int minMoves(int[] nums) {

        if (nums==null||nums.length==0){
            return 0;
        }
        int sum = 0 ;
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            sum+=num;
            min = Math.min(min,num);
        }

        return sum - min*nums.length;
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count= 0;
        for(int i = 1;i<nums.length;i++){
            int diff = (nums[i]+count)-nums[i-1];
            nums[i]+=count;
            count+=diff;
        }
        return count;
    }
}
