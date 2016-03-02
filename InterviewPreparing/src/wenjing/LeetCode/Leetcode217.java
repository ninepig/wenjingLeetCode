package wenjing.LeetCode;

import java.util.HashSet;

/*
 * 217
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array,
 *  and it should return false if every element is distinct.
 */

/*
 * 解题思路：
 * 这道题 数组去重，比较简单 ，因为不用考虑到键值 ，考虑到键值的可以用还是hashmap
 * 第一反应就是用hashset 
 * 第二反应就是对数组排序，然后看看前后是否相等
 */
public class Leetcode217 {

	public boolean containDuplicate(int nums[]){
		
		
		if(nums.length<1){
			return false;
		}
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i< nums.length;i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
		
	}
	
	
}
