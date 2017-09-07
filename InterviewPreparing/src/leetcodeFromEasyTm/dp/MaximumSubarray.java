package leetcodeFromEasyTm.dp;

/**
 * Created by yangw on 2017/9/6.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int local = nums[0];
        int global = nums[0];
        for(int i = 0 ; i < nums.length ;i++){
            local = Math.max(nums[i],local+nums[i]);
            global = Math.max(global,local);
        }
        return global;
    }

}
