package wenjing.LeetCode;

import java.util.HashMap;

/*
 * LeetCode 205 isomorphic String
自己一次bug过得
映射字符串
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.

就是维护一个hashmap  key 相同的情况，比较value 不同 false
key不同的情况下，如果已经有了这个value ，也false （因为只能一个char只能map一个）

 */
public class LeetCode205 {

	 public boolean isIsomorphic(String s, String t) {
	        
		 if(s == null || t == null){
			 return false;
		 }
		 if(s.length() != t.length()){
			 return false;
		 }
		 
		 if(s.length() == 0 && t.length() == 0){
			 return true;
		 }
		 
		 HashMap<Character, Character>  charMap = new HashMap<>();
		 
		 char charOfS;
		 char charOft;
		 char tempChar;
		 
		 for(int i = 0 ; i<s.length();i++){
			 charOfS = s.charAt(i);
			 charOft = t.charAt(i);
			 if(!charMap.containsKey(charOfS)){
				 
				 if(!charMap.containsValue(charOft)){
					 charMap.put(charOfS, charOft);
				 }else{
				 // 因为已经contain了这个value，所以 key不同的情况下，直接就错了
				 return false;
				 }
			 }else{
				 tempChar = charMap.get(charOfS);
				 if(tempChar != charOft ){
					 return false;
				 }
				 
			 } 
		 }
		 
		 return true;
		 
	    }
	
	
	
}
