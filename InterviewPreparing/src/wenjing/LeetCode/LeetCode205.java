package wenjing.LeetCode;

import java.util.HashMap;

/*
 * LeetCode 205 isomorphic String
�Լ�һ��bug����
ӳ���ַ���
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.

����ά��һ��hashmap  key ��ͬ��������Ƚ�value ��ͬ false
key��ͬ������£�����Ѿ��������value ��Ҳfalse ����Ϊֻ��һ��charֻ��mapһ����

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
				 // ��Ϊ�Ѿ�contain�����value������ key��ͬ������£�ֱ�Ӿʹ���
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
