package wenjing.LeetCode;

import java.util.HashMap;
/*
 * leetCode290 
word patten
让你根据字符串 ，判断是否匹配pattern
自己想的，我觉得没问题，但是leetcode某无法通过示例
后面的带空格的字符串用 正则 split 分开
因为要根据前面的字符串一一匹配，第一反应就是利用hashmap，key用前面的字符串的字符，value 用split的字符串，不过这个题中间有点问题，字符串相等的判断要用isequal
一一匹配的第一反应就是用hashmap



问题，字符串相等的判断要用isequal

 */
public class LeetCode290 {
    public boolean wordPattern(String pattern, String str) {
	     HashMap<Character, String> hashMap = new HashMap<>();
	     
	     //spilt string to string[] using space;
	     
	     String[] pattenString = str.split("\\s+");
	     
	     /*
	      * 特殊情况
	      */
	     if(pattern.length() != pattenString.length){
	         return false;
	     }
	     
	     
	     for(int i = 0 ;i< pattern.length();i++){
	    	 if(hashMap.containsKey(pattern.charAt(i))){
	    	    if(!hashMap.get(pattern.charAt(i)).equals(pattenString[i])){
	    			 return false;
	    		 }
	    	 }else{
	    		 //要考虑 映射到同一个值的情况，所以要判断下
	    	     if(hashMap.containsValue(pattenString[i])){
	    	         return false;
	    	     }else{
	    		hashMap.put(pattern.charAt(i), pattenString[i]); 
	    	    }
	    	 }
	    	 
	     }
	     
		  return true;
		  
	    }
	  
	  public static void main(String[] args){
		 String pattern = "abba";
		   String  str = "dog cat cat dog";
//	  System.out.print(wordPattern(pattern, str));
	  
	  }
}
