package wenjing.LeetCodeArray;

import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-03-04.
 */
public class missingNumber {
    public int missingNumber(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
        Arrays.sort(nums);
            if(nums[0]!=0){
                return 0;
            }
            int missingNumber = 0;
            for(int i = 0 ; i<nums.length-1;i++){
                if((nums[i]+1)!=nums[i+1]){
                    missingNumber = nums[i]+1;
                    return missingNumber;
                }
            }
            missingNumber = nums[nums.length-1]+1;
            return  missingNumber;
    }
    //等差数列的方法
    public int missingNumberSum(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int arraySize = nums.length;
        int expect = (arraySize+1)*arraySize/2;
        for(int i = 0;i<arraySize;i++){
            expect -= nums[i];
        }
        return expect;

    }
    //xor
    public int missingNumberXor(int[] nums) { //xor
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public int missingNumberBinarySearch(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        return left;
    }

}

