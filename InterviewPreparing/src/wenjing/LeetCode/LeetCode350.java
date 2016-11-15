package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 */
public class LeetCode350 {
/*
 * 和349比 不去重。
 */
	 public int[] intersect(int[] nums1, int[] nums2) {
		 if(nums1.length==0 || nums2.length==0){
			 return new int[0];
		 }
		ArrayList<Integer> resultArray = new ArrayList<>();
		HashMap<Integer, Integer> resultMap = new HashMap<>();
		for(int i = 0;i<nums1.length;i++){
			if(resultMap.containsKey(nums1[i])){
				resultMap.put(nums1[i], resultMap.get(nums1[i])+1);
			}else{
				resultMap.put(nums1[i], 1);
			}
		}
		for(int j = 0 ;j<nums2.length;j++){
			if(resultMap.containsKey(nums2[j])){
				if(resultMap.get(nums2[j])>0){
					resultArray.add(nums2[j]);
					resultMap.put(nums2[j], resultMap.get(nums2[j])-1);
				}
				
			}
		}
		int[] resultIntArray = new int[resultArray.size()];
		
		
		for(int k = 0; k<resultArray.size();k++){
			resultIntArray[k]=resultArray.get(k);
		}
		 
		 return resultIntArray;
			
	    }
	
}
