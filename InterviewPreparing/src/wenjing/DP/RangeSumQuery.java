package wenjing.DP;

/**
 * Created by yamengwenjing on 2017-04-13.
 */
public class RangeSumQuery {

//    public NumArray(int[] nums) {
//
//    }

    int[] sum;
    public RangeSumQuery(int[] nums){
        if(nums==null||nums.length==0){
            return ;
        }
        int length = nums.length;
        //要注意 int array 是需要初始化的
        sum = new int[length];
        sum[0] = nums[0];
        for(int i = 1;i<length;i++){
            sum[i] = sum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return i==0? sum[j]:sum[j]-sum[i-1];
    }

}
