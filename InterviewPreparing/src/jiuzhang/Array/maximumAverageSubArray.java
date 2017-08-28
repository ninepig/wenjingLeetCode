package jiuzhang.Array;

/**
 * Created by yangw on 2017/8/28.
 */
public class maximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {

        long sum = 0;
        for(int i = 0 ; i<k;i++){
            sum +=nums[i];
        }
        long max = sum;

        for(int j = k ; j<nums.length;j++ ){
            sum = sum+nums[j]-nums[j-k];
            max =Math.max(max,sum);
        }

        return max/1.0/k;
    }
}
