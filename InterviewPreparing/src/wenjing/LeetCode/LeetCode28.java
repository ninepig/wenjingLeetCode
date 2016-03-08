package wenjing.LeetCode;

/*
 * leetCode 28 字符串匹配
这道题用暴力法的时间复杂度是O（mn） mn分别是字符串的长度，如果要让最优 应该是o（m+n），是KMP算法 比较复杂的一个算法，要学习一下
这道题其实我自己的思路和暴力算法的思路差不多
自己的想法就是找到第到第一位字符和原字符串的相同，然后比较剩下的，但是自己从编程角度实现上出了问题。
我们先说说brute force的算法，假设原串的长度是n，匹配串的长度是m。思路很简单，就是对原串的每一个长度为m的字串都判断是否跟匹配串一致。总共有n-m+1个子串，所以算法时间复杂度为O((n-m+1)*m)=O(n*m)
大神的思路

 */
public class LeetCode28 {
//	  public int strStr(String a, String b) {
//	      if(a == null || b == null||a.length()==0||a.length()<b.length()){
//	    	  return -1;
//	      }
//	      if(b.length() == 0 ){
//	    	  return 0;
//	      }
//	      
//		  int position = -1;  
//		  
//		  for(int i = 0; i <= a.length()-1;i++){
//			  
//			  if(a.charAt(i) == b.charAt(0)){
//				  
//
//				  int remainLength = b.length()-1;
//				  while(remainLength>0){
//					  
//					  if(a.charAt(++i)!=b.charAt(remainLength)){
//						  return -1;
//					  }
//					  
//					  remainLength--;
//				  }
//				  
//				  return i;
//				  
//			  }
//	  		  
//		  }
//	  
//		  return position;
//	    }
	//大神的做法 完爆我的啊。 
	//如果你第一次判断到false，就跳出 是不合理的，因为下面还有字符串可能满足条件
	public int strStr(String haystack, String needle) {  
		if(haystack == null || needle == null|| needle.length()==0){
			return 0;
		}
		if(haystack.length()<needle.length()){
			return -1;
		}
		for(int i = 0; i<= haystack.length()-needle.length();i++){
			boolean ifEqual = true;
			for(int j = 0 ; j < needle.length();j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					ifEqual = false;
					break;
				}
//				if(!ifEqual){
//					return -1;
//				}
			}
			
			if(ifEqual){
				return i;
			}
		}
		
		return -1;
	}
	
	
}
