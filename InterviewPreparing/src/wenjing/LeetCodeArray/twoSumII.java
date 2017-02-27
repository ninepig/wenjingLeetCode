package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2017-02-23.
 */
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class twoSumII {
        //排好序的数组，所以想的是用两个指针，左右，不断逼近。或者用hashmap
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length-1;
        int[] res = new int[2];
        while(leftIndex<rightIndex){

            if(numbers[leftIndex]+numbers[rightIndex]>target){
                rightIndex--;
            }else if(numbers[leftIndex]+numbers[rightIndex]<target){
                leftIndex++;
            }else {
                break;
            }

        }
        //看题要仔细，他要求输出的是index（从1开始）
        res[0] =leftIndex+1;
        res[1] = rightIndex+1;
        return  res;
    }

}
