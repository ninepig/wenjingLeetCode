//package wenjing.LeetCode;
///*
// * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//
//Each letter in the magazine string can only be used once in your ransom note.
// *
// *��B���������ַ� ��һ��ֻ��ʹ��һ�Σ����ܲ������A����
// *
// *
// *������Ŀ��Ϊ�ǿ��Ƿ���ɣ���һ��Ӧ�;���hashmap���������������¼ÿһλ����ĸ������leetcode discuss��
// */
//public class LeetCode383 {
//	  public boolean canConstruct(String ransomNote, String magazine) {
//
//		  int[] arr = new int[26];
//
//		  for(int i = 0 ; i<magazine.length();i++){
//			  arr[magazine.charAt(i)-'a']++;
//		  }
//		  for(int j = 0; j<ransomNote.length();j++){
//			  if(--arr[ransomNote.charAt(j)-'a']<0){
//				  return false;
//			  }
//		  }
//		  return true;
//	    }
//	  // hash map
//	  public boolean canConstruct2(String ransomNote, String magazine) {
//
////		  if(ransomNote == null || magazine == null){
////		       return false;
////		   }
////
////		   for(int i=0;i<ransomNote.length();i++){
////
////		        if(!hmap.containsKey(ransomNote.charAt(i))){
////		            hmap.put(ransomNote.charAt(i),0);
////		        }else{
////		            int count = hmap.get(ransomNote.charAt(i));
////		            hmap.put(ransomNote.charAt(i),count+1);
////		        }
////
////		   }
////
////		   for(int i=0;i<magazine.length();i++){
////
////		        if(hmap.containsKey(magazine.charAt(i))){
////		            int count = hmap.get(magazine.charAt(i));
////		            hmap.put(magazine.charAt(i),count-1);
////		        }
////
////		   }
////
////
////		    for(int i=0;i<ransomNote.length();i++){
////		        if(hmap.get(ransomNote.charAt(i))>=0)
////		        return false;
////		    }
////
////
////		   return true;
//
////		}
////
////}
