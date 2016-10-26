package wenjing.LeetCode;

public class LeetCode26 {
	  public int removeDuplicates(int[] nums) {
	    
		  
		  if(nums == null|| nums.length == 0){
			  return 0;
		  }
		  int count = 1;
		  int numberDuplicate = nums[0];
		  for(int i = 1 ; i<nums.length;i++){
			  
			 if(nums[i] != numberDuplicate){
				 nums[count] = nums[i];
				 count++;
				 numberDuplicate = nums[i];
			 }
			  
		  }
		  
		  return count;
		  
	    }
}
