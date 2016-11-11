package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * LeetCode 242 ���δ�

�� �Լ����뷨�ǶԵġ�ֱ��sort ĳһ������ Ȼ��ȽϾͿ����ˡ��������api���ô��ˡ���
Ҫ�� arrays.sort��������Ե� �����ַ�������UNICODE������
������unicode���Ϳ�����ͨ�ַ� ascII ���256���ַ�  ����0-255 �Ϳ��Ա�ʾ��
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
    	//�����ַ���û�п��ǵ� ���s=aa t=bb�����
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
        
    	
    	//��ά��int����ķ���
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
