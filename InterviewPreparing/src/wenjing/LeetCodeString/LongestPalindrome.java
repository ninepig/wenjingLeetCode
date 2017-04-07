package wenjing.LeetCodeString;

import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-03-01.
 */
public class LongestPalindrome {

    public int longestPalindromeSet(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0 ;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char thisChar = s.charAt(i);
            if(set.contains(thisChar)){
                result+=1;
                set.remove(thisChar);
            }else{
                set.add(thisChar);
            }
        }
        if(!set.isEmpty()){
            result = result*2+1;
        }else{
            result *=2;
        }
        return  result;
    }
    //效率更高
    public int longestPalindromeArray(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0 ;
        int[] resultArray = new int['z'-'A'+1];

        for(int i =0 ;i<s.length();i++){
            resultArray[s.charAt(i)-'A']++;
        }
        for(int i = 0;i<resultArray.length;i++){
            result += resultArray[i]/2*2;
        }
        if(result<s.length())
            result++;
        return result;
    }

}
