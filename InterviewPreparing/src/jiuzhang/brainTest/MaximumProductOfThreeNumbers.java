package jiuzhang.brainTest;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yangw on 2017/8/27.
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]);
    }
    public int maximumProductBetter(int[] nums) {
       int max1 = Integer.MIN_VALUE,max2 =Integer.MIN_VALUE,max3 =Integer.MIN_VALUE;
       int min1 = Integer.MAX_VALUE,min2 =Integer.MAX_VALUE;

        for (int number: nums){
            if(number>max1){
                max3 =max2;
                max2 = max1;
                max1 = number;
            }else if(number>max2){
                max3=max2;
                max2 = number;
            }else if(number>max3){
                max3 = number;
            }

            if(number<min1){
                min2 = min1;
                min1 = number;
            }else if(number<min2){
                min2 = number;
            }
        }

        return Math.max(min1*min2*max1,max1*max2*max3);

    }
}
