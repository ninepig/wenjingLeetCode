package jiuzhang.someGreatAlg.reserviorSampling;

import wenjing.LeetCode.ListNode;

import java.util.Random;

/**
 * Created by yangw on 2017/8/22.
 */
public class RandomPickIndex {

    int[] nums;
    Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();

    }
    public int pick(int target) {

        int result = -1;
        int count = 0;

        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]!=target){
                continue;
            }
            count++;
            if(random.nextInt(count)==0){
                result = i;
            }
        }
        return result;
    }

}
