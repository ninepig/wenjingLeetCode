package wenjing.LeetCode;

import java.util.Arrays;


/*
 * ���Ǳ������飬�Ѻ�Ҫɾ��val��һ����Ԫ�طŵ������ǰ������ˡ��൱���������������飬
�����µ�index���治��ͬ��ֵ���������ǰ��

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
