package leetcodeFromEasyTm.hash;

import java.util.HashMap;

/**
 * Created by wenjingyang on 8/31/17.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s){
        if(s == null || s.length()==0){
            return true;
        }

            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0 ; i< s.length() ; i++){
                char thisChar = s.charAt(i);
                map.put(thisChar,map.getOrDefault(map.get(thisChar),0)+1);

            }

            int numberOfOne = 0;
            for (Character c: map.keySet()){
                numberOfOne+=map.get(c)%2;
            }
            return numberOfOne<=1;


    }
}
