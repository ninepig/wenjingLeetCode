package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * LeetCode 242 变形词

马蛋 自己的想法是对的。直接sort 某一个数组 然后比较就可以了。。结果是api调用错了。。
要用 arrays.sort。。。麻痹的 ，这种方法对于UNICODE都可以
不考虑unicode，就考虑普通字符 ascII 最多256个字符  即用0-255 就可以表示了
http://www.ruanyifeng.com/blog/2007/10/ascii_unicode_and_utf-8.html

 */
public class LeetCode242 {
	 //6ms solution for inputs contain unicode characters
    public boolean isAnagram0(String s, String t) {
        if(s==null || t==null || s.length()!=t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        if(new String(sc).equals(new String(tc)))
            return true;
        return false;
    }

    //3ms basic ASCII 
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length())
            return false;
        int[] alphabets = new int[256];
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for(char c : sc){
            alphabets[c]++;
        }
        for(char c : tc){
            if(alphabets[c]>0)
                alphabets[c]--;
            else
                return false;
        }
        return true;
    }
    
    
    
    //2016.11.6
    public boolean isAnagram3(String s, String t) {
    	//用这种方法没有考虑到 如果s=aa t=bb的情况
//        if(s==null||t==null){
//        	return false;
//        }
//        if(s.length() !=t.length()){
//        	return false;
//        }
//        int result = 0;
//        for(int i = 0 ;i<s.length();i++){
//        	result^= (s.charAt(i)-'a')^(t.charAt(i)-'a'); 
//        }
//        
//        if(result==0){
//        	return true;
//        }
//        return false;
        
    	
    	//用维护int数组的方法
      if(s==null||t==null){
    	return false;
    }
    if(s.length() !=t.length()){
    	return false;
    }

    int[] charNumber = new int[26];
  
    char[] charArrayS = s.toCharArray();
    char[] charArrayT =t.toCharArray();
    
    for(char s1:charArrayS){
    	charNumber[s1-'a']++;
    }
    for(char t1: charArrayT){
    	if(charNumber[t1-'a'] >0){
    		charNumber[t1-'a']--;  
		}else{
			return false;
		}
    }
    return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
