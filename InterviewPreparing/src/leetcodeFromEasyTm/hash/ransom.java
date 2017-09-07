package leetcodeFromEasyTm.hash;

import java.util.HashMap;

/**
 * Created by yangw on 2017/9/2.
 */
public class ransomN {
    public boolean canConstruct(String ransomNote, String magazine) {

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
    public boolean canConstruct2(String ransomNote, String magazine) {
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
