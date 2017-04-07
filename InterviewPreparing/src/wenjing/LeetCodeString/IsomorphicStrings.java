package wenjing.LeetCodeString;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-06.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||t==null||s.length()<=1){
            return true;
        }
        if(s.length() !=t.length()){
            return true;
        }
        HashMap<Character,Character> matchTable = new HashMap<>();
        for(int i = 0 ; i <s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(matchTable.containsKey(a)){
                if (matchTable.get(a).equals(b)){
                    continue;
                }else {
                    return false;
                }
            }else {
                if(!matchTable.containsValue(b)){
                    matchTable.put(a,b);

                }else {
                    return false;
                }

            }

        }


        return true;


    }
//better way
    /*
    Hi guys!

The main idea is to store the last seen positions of current (i-th) characters in both strings. If previously stored positions are different then we know that the fact they're occuring in the current i-th position simultaneously is a mistake. We could use a map for storing but as we deal with chars which are basically ints and can be used as indices we can do the whole thing with an array.

Check the code below. Happy coding!


     */
    public boolean isIsomorphic2(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }
}
