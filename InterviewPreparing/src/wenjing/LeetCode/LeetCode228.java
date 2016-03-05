package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * leetcode 228 需要再做做
一开始想用一个临时变量，如果他等于 num【I+1】就说明没有中断，但是这个方法会报数组超界的问题，数组类的题目都会这样。要数组数两两相比的时候 I+1不能乱用，宁愿让i从数组的第一个开始，和第0个作比较，会很安全。
这个题目自己一开始就没把题目想清楚，做题做得太少了。这个完全是不太会
把思想转化为代码的思想才可以。一定要考虑周全 考虑细致

 */
public class LeetCode228 {
	 public List<String> summaryRanges(int[] nums) {
	        
		
		 List<String> resultList  = new ArrayList<>();
		 
		 if(nums==null || nums.length==0){
			 return resultList;
 		 }
		
		 String tempString;
		 boolean newStart = true;
		 
		 int beginNumber = nums[0];
		 int endNumber ;
		 for(int i=1; i<nums.length;i++){
			 
	
			 if(nums[i]-nums[i-1]==1){
				 newStart = false;
				 endNumber = nums[i];
			 }else{
				 newStart = true;
				 if(nums[i-1] == beginNumber){
					 resultList.add(Integer.toString(beginNumber));
				 }else{
					 resultList.add(Integer.toString(beginNumber)+"->"+Integer.toString(nums[i-1]));
				 }
				 beginNumber = nums[i];
			 }
			 
		 }
		 //直到最后就没有出现newstart的情况，连续了
		 if(!newStart){
			 resultList.add(Integer.toString(beginNumber)+"->"+Integer.toString(nums[nums.length-1]));
		 }else{
			 //最后newStart是true，但是只有一个参数的情况
			 resultList.add(Integer.toString(beginNumber));
		 }
		 
		 return resultList;
		 
	 }
}
