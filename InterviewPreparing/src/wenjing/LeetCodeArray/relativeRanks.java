package wenjing.LeetCodeArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-02-22.
 */
/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 */
public class relativeRanks{
        public String[] findRelativeRanks(int[] nums) {
                if(nums==null||nums.length==0){
                    return null;
                }
            HashMap<Integer,Integer> postionMap = new HashMap<>();
            String[] result = new String[nums.length];
            for(int i = 0 ; i<nums.length;i++){
                postionMap.put(nums[i],i);
            }
            Arrays.sort(nums);
            for(int i = 0 ; i<nums.length-3;i++){
                result[postionMap.get(nums[i])] = String.valueOf(nums.length-i);
            }
            if(nums.length>=3)result[postionMap.get(nums[nums.length-3])] = "Bronze Medal";
            if(nums.length>=2)result[postionMap.get(nums[nums.length-2])] = "Silver Medal";
            result[postionMap.get(nums[nums.length-1])] = "Gold Medal";

            return result;
        }

}
