package wenjing.LeetCode;
/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
 *
 *从B数组中找字符 ，一次只能使用一次，看能不能组成A数组
 *
 *
 *这种题目因为是看是否组成，第一反应就就是hashmap，或者是用数组记录每一位的字母数量（leetcode discuss）
 */
public class LeetCode383 {
	  public boolean canConstruct(String ransomNote, String magazine) {
	        
		  int[] arr = new int[26];
		  
		  for(int i = 0 ; i<magazine.length();i++){
			  arr[magazine.charAt(i)-'a']++;
		  }
		  for(int j = 0; j<ransomNote.length();j++){
			  if(--arr[ransomNote.charAt(j)-'a']<0){
				  return false;
			  }
		  }
		  return true;
	    }
	  // hash map
	  public boolean canConstruct2(String ransomNote, String magazine) {
	        
//		  if(ransomNote == null || magazine == null){
//		       return false;
//		   }
//		   
//		   for(int i=0;i<ransomNote.length();i++){
//		   
//		        if(!hmap.containsKey(ransomNote.charAt(i))){   
//		            hmap.put(ransomNote.charAt(i),0);    
//		        }else{
//		            int count = hmap.get(ransomNote.charAt(i));
//		            hmap.put(ransomNote.charAt(i),count+1);
//		        }
//		       
//		   }
//		   
//		   for(int i=0;i<magazine.length();i++){
//		   
//		        if(hmap.containsKey(magazine.charAt(i))){   
//		            int count = hmap.get(magazine.charAt(i));
//		            hmap.put(magazine.charAt(i),count-1);
//		        }
//		       
//		   }
//		   
//		   
//		    for(int i=0;i<ransomNote.length();i++){
//		        if(hmap.get(ransomNote.charAt(i))>=0)
//		        return false;
//		    }
//		   
//		   
//		   return true;
		    
		}
	  
}
