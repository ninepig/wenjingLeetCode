package wenjing.LeetCode;

import java.util.HashMap;
/*
 * leetCode290 
word patten
��������ַ��� ���ж��Ƿ�ƥ��pattern
�Լ���ģ��Ҿ���û���⣬����leetcodeĳ�޷�ͨ��ʾ��
����Ĵ��ո���ַ����� ���� split �ֿ�
��ΪҪ����ǰ����ַ���һһƥ�䣬��һ��Ӧ��������hashmap��key��ǰ����ַ������ַ���value ��split���ַ���������������м��е����⣬�ַ�����ȵ��ж�Ҫ��isequal
һһƥ��ĵ�һ��Ӧ������hashmap



���⣬�ַ�����ȵ��ж�Ҫ��isequal

 */
public class LeetCode290 {
    public boolean wordPattern(String pattern, String str) {
	     HashMap<Character, String> hashMap = new HashMap<>();
	     
	     //spilt string to string[] using space;
	     
	     String[] pattenString = str.split("\\s+");
	     
	     /*
	      * �������
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
	    		 //Ҫ���� ӳ�䵽ͬһ��ֵ�����������Ҫ�ж���
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
