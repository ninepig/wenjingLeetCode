package wenjing.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*169
 * Given an array of size n, find the majority element. The majority element is the element
 *  that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
/*
 * 自己的解题思路，
 * 新建一个数组，把原先数组中每一位的值当做新数组的index（这样会浪费空间 ,空间为N），然后遍历下目标数组，把数出现的次数存储在新建数组对应的值上
 * 似乎不太好这个方法 
 * 这个方法类似hashtable的解题思路，用hashtable就可以了，因为是动态分配内存。不需要你知道你的初始化int array的大小
 * 
 * 大神解题思路
 * 对数组进行排序，因为是majority的element，所以这个数一定会占整个数组的一半以上，所以取数组的中间值，这个数一定在中间值的位置。
 *这个方法太巧秒了
 
 *
 */
public class Leetcode169 {
	
	
	//O(nlogn) time, but more cleary
	public int majortiyNumber(int[] nums){
		
		 Arrays.sort(nums);
		 return nums[nums.length/2];
	}
	
	
	public int majorityNumberHashMap(int[] num){
		
		int res = 0;
		int maxTimes = 0 ;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int number:num){
			
			if(map.containsKey(number)){
				int times = map.get(number);
				map.put(number, times+1);
			}else{
				map.put(number,1);
			}
			if(map.get(number)>maxTimes){
				maxTimes = map.get(number);
				res = number;
			}
			
		}
		
		return res;
		
		
		
	}
	
}
