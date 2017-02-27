package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2017-02-19.
 *
 * /
 /*
 **Given an array of integers, every element appears twice except for one. Find that single one.
 * 这个题用异或是最方便的，而且最节省空间，时间也就是N
 * 本来想用数组的index方法，但是这个数不确定正负，所以比较难办。
 */
public class SingleNumber {
    public int singleNumber(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int result = 0;
        for(int i =0;i<nums.length;i++){
            result = result^nums[i];
        }
        return  result;

    }


}
