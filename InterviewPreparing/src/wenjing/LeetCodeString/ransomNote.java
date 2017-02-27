package wenjing.LeetCodeString;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-02-25.
 */
public class ransomNote {
    public boolean canConstructArray(String ransomNote, String magazine) {
        int[] magazinCharArray = new int[52];
        for(int i = 0; i<magazine.length();i++){
            magazinCharArray[magazine.charAt(i)-'a']++;
        }

        for(int i = 0;i<ransomNote.length();i++){
            if(--magazinCharArray[ransomNote.charAt(i)-'a'] <0){
                return  false;
            }
        }
        return true;
    }
    /*
    自己写的用hm的方法，但是速度效率都很低，代码也不够简洁
     */
    public boolean canConstrutctHm(String ransomNote, String magazine){

        HashMap<Character,Integer> dict = new HashMap<>();

        for(int i = 0 ; i<magazine.length();i++){
            if(dict.containsKey(magazine.charAt(i))){
                dict.put(magazine.charAt(i),dict.get(magazine.charAt(i))+1);
            }else {
                dict.put(magazine.charAt(i),1);
            }
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(!dict.containsKey(ransomNote.charAt(i))){
                return false;
            }else {
                dict.put(ransomNote.charAt(i),dict.get(ransomNote.charAt(i))-1);
               if(dict.get(ransomNote.charAt(i))<0){
                   return false;
               }
            }
        }
        return true;
    }
}
