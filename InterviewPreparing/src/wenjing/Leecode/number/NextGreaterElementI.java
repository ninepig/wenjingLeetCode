package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-02-17.
 */

/*
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the
 corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

这道题没有审题正确，没看懂英文，他要求的是correspoding place, 是第一个数组中数字在第二个数组中对应的数的位置。想明白了很简单。用的方法比较暴力 O（nlogn2）
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
            if(nums.length==0){
                return new int[0];
            }
            //resultArray
            int[] resultArray = new int[findNums.length];
            int compareNumber;
            int tempNumber;

            for(int i = 0; i<findNums.length;i++){
            compareNumber = findNums[i];
            tempNumber=-1;
                for(int j=compareNumberIndex(compareNumber,nums);j<nums.length;j++){
                    if(compareNumber<nums[j]){
                        tempNumber=nums[j];
                        break;
                    }
                }
            resultArray[i]=tempNumber;
            }

            return  resultArray;


    }

    private int compareNumberIndex(int compareNumber, int[] nums) {

        for(int i = 0;i<nums.length;i++){
                if(compareNumber==nums[i]){
                    return  i;
                }
            }
        return 0;
    }

}
