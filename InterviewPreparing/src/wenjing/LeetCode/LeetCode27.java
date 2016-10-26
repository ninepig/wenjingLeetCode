package wenjing.LeetCode;

import java.util.Arrays;


/*
 * 就是遍历数组，把和要删除val不一样的元素放到数组的前面就行了。相当于重新排列了数组，
利用新的index保存不相同的值到数组的最前列

 */
public class LeetCode27 {
	  
	
	public int removeElement(int[] nums, int val) {
	        
//		Arrays.sort(nums);
//		if(nums == null || nums.length == 0){
//			return 0;
//		}
//		
//		int count = 0;
//		for(int i = 0 ; i<nums.length;i++){
//			
//			if(nums[i] == val){
//				count++;
//			}
//			
//		}
//		
//		return nums.length - count;
		
		
		if(nums == null || nums.length == 0){
		return 0;
		}
		
		
		int count = 0;
		
		for(int i = 0 ; i < nums.length;i++){
			if(nums[i] != val){
				nums[count] = nums[i];
				count++;
			}
		}
		
		return count;
		
		
	}
	  
	  
}
