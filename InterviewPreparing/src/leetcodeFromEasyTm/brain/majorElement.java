package leetcodeFromEasyTm.brain;

import java.util.Arrays;

/**
 * Created by yangw on 2017/9/3.
 */
public class majorElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
