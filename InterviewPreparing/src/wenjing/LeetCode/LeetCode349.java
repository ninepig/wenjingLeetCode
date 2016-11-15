package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * 
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 * 
 */
public class LeetCode349 {
	/*
	 * using hashset to do this question
	 * first get nums1 into set then nums2
	 * and using arraylist to store result but in this time you need to do dedupulicate
	 */
	
	 public int[] intersection(int[] nums1, int[] nums2) {
		 
		 
		 if(nums1.length==0 || nums2.length==0){
		 return new int[0];
	 }
		 
	
		HashSet<Integer> resultMap = new HashSet<Integer>();
		 ArrayList<Integer> resultArray = new ArrayList<>();
		
		 for(int i= 0; i< nums1.length;i++){
			 
			 if(resultMap.contains(nums1[i])){
				 continue;
			 }else{
				 resultMap.add(nums1[i]);
			 }
			 
		 }
		 
		 for(int j= 0; j< nums2.length;j++){
			 if(resultMap.contains(nums2[j])){
				 if(resultArray.contains(nums2[j])){
					 continue;
				 }else{
					 resultArray.add(nums2[j]);
				 }
			 }
		 }
		int[] resultIntArray = new int[resultArray.size()];
		
		
		for(int k = 0; k<resultArray.size();k++){
			resultIntArray[k]=resultArray.get(k);
		}
		 
		 return resultIntArray;
		 
		 
	 }
	
	/*
	 * 脑子抽住了。。nums 是可能超过10的数啊 兄弟，肯定hashset来做啊
	 */
//	 public int[] intersection(int[] nums1, int[] nums2) {
//		 if(nums1.length==0 || nums2.length==0){
//			 return new int[0];
//		 }
//	     int[] result = new int[10];
//	     int[] numsNumber = new int [10];
//	     int[] nums2Number = new int[10];
//	     
//	     for(int i = 0 ; i < nums1.length;i++){
//	    	 numsNumber[nums1[i]]++;
//	     }
//	     for(int j = 0 ;j < nums2.length;j++){
//	    	 nums2Number[nums2[j]]++;
//	     }
//	     
//		 int index = 0;
//	     for(int k = 0 ; k<10;k++){
//	    	 
//	    	 if(numsNumber[k]>0&&nums2Number[k]>0){
//	    		 result[index] = k;
//	    		 index++;
//	    	 }
//	     }
//	     int[] finalResult = new int[index+1];
//	     
//	     for(int o=0 ; o<=index;o++){
//	    	 finalResult[o] = result[o];
//	     }
//	     
//	     return finalResult;
//	    }
	 
//	 public static void main(String args[]){
//		 int[] result  = {1,2,3,4,5,6,7,8,1,2,3,4,5};
//		 int[] resultNumber = new int[10];
//		 
//		 for(int i = 0 ; i < result.length;i++){
//			 resultNumber[result[i]]++;
//		 }
//		 
//		 for(int j = 0 ; j < resultNumber.length;j++ ){
//			 System.out.println(resultNumber[j]);
//		 }
//		 
//	 }
}
