package wenjing.LeetCodeArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-02-19.
 */
/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
/*
找到没有的数，这个题的难点在于不能用额外的空间， 所以要在原来的数组上做文章。
想到的就应该是用原来的数组的值作为index，这样就可以找到没有存在的index
https://discuss.leetcode.com/topic/65738/java-accepted-simple-solution/2
之前的想法没办法不用extra space，
这个方法可以，利用绝对值来算，如果这个数出现过了，就把他对应的num的index 上的值致为负数。非常巧妙的方法
 */
public class findAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> resultList = new ArrayList<>();
        if(nums.length==0||nums ==null){
            return  resultList;
        }
        int length = nums.length;
        for(int i = 0;i<length;i++){
            // 获取对应的index ， 取绝对值得目的是因为，这个数可能已经被致为负了，所以要变为正，非常巧妙的方法。
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val]=-nums[val];
            }
        }

        for(int i = 0;i<length;i++){
            if(nums[i]>0){
                resultList.add(i+1);
            }
        }

        return  resultList;
    }


}
