package wenjing.leetcodeDp;

/**
 * Created by yamengwenjing on 2016-11-15.
 */
public class HouseRubber {
    //抢劫犯问题，其实就是个动态规划问题，对于当前人家来说，要比较的是这家人和前前一家之和和前一家比谁的价值高。

    public int rob(int[] nums) {
        if(nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] maxResult = new int[nums.length];
        maxResult[0]=nums[0];
        maxResult[1] = Math.max(nums[0],nums[1]);

        for(int i = 2;i<nums.length;i++){
            maxResult[i] = Math.max(nums[i]+maxResult[i-2],maxResult[i-1]);
        }
        return maxResult[nums.length-1];
    }

}
