package wenjing.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1 {
	//hashmap�ķ���
//	  public int[] twoSum(int[] nums, int target) {
//	    
//		  HashMap<Integer, Integer> map = new HashMap<>();
//		  int[] result = new int[2];
//		  
//		 for(int i = 0;i<nums.length;i++){
//			 
//			 if(map.containsKey(target - nums[i])){
//				 result[0] = map.get(target-nums[i]);
//				 result[1] = i;
//				 break;
//			 }
//			 map.put(nums[i], i);
//			
//		 }
//		  
//		  return result;
//	    }
	//�бƷ�
	 public int[] twoSum(int[] nums, int target) {
		 
		  Arrays.sort(nums);
		 
		 int[] result = new int[2];
		 
		 result = twoSumHelp(nums,target);	
		 
		 return result;
	 }

	private int[] twoSumHelp(int[] nums, int target) {
		// TODO Auto-generated method stub
		 int[] result = new int[2];
		int left = 0;
		int right = nums.length-1;
		while(left<right){
			
			if(nums[left]+nums[right]>target){
				right--;
			}else if(nums[left]+nums[right]<target){
				left++;
			}else{
				//Ϊʲô�������ΪҪ���ص���ԭ����index����������������ĵ�index��������������B�������©�ġ���Ϊ������sorted�ġ�
//				result[0]=num[left];
//				result[1]=num[right];
				break;
			}
			
			
		}
		
		
		 
		 
		return result;
	}
	  
}
