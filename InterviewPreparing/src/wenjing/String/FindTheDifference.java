package wenjing.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yamengwenjing on 2017-02-21.
 *Given two strings s and t which consist of only lowercase letters.

 String t is generated by random shuffling string s and then add one more letter at a random position.

 Find the letter that was added in t.
 */
/*
所有找difference的第一反应一定要是用异或！
当然这个题用hashset 应该也可以解决！
 */

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        if(s==null||t==null){
            return ' ';
        }
        if(s.length()==0&&t.length()==1){
            return t.charAt(0);
        }
        int res = (int)t.charAt(0);
        for(int i = 0; i<s.length();i++){
            res = res^(s.charAt(i));
            res = res^(t.charAt(i+1));
        }
        return (char)res;
    }
}