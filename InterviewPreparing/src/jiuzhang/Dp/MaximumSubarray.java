package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/8.
 */
public class MaximumSubarray {
    //greedy
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int global = nums[0];
        int local = nums[0];

        for(int i = 1;i<nums.length;i++){
            local = Math.max(nums[i],local+nums[i]);
            global = Math.max(global,local);
        }

        return global;
    }

    public int maxSubArrayDp(int[] nums){

        if(nums==null||nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < nums.length ; i++){
            dp[i] = nums[i]+(dp[i-1]>0 ? dp[i-1] : 0);
            max = Math.max(max,dp[i]);
        }

        return max;
    }


}
