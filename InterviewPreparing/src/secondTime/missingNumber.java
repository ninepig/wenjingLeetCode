package secondTime;

import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-05-02.
 */
public class missingNumber {
    public int missingNumber(int[] nums) {
        //nlogn
        Arrays.sort(nums);

        int i =0;
        for( ; i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }

        }
        return i;
    }

    public int missingNumberLinear(int[] nums){

        int initialVal = 0;
        int i =0;
        for(;i<nums.length;i++){
            initialVal^=nums[i]^i;
        }
        return  initialVal^i;

    }

    public int missingNumberLinear2(int[] nums){

       int sum = (nums.length+1)*(0+nums.length)/2;
       int sum2 = 0 ;
        for(int i =0;i<nums.length;i++){
              sum2 += nums[i];
        }
        return sum-sum2;

    }
}
