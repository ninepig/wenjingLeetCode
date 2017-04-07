package wenjing.LeetCodeSubString;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-05.
 */
public class MinWindowsSubString {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int counter = map.size();
        int left=0,right = 0;
        int len = Integer.MAX_VALUE;
        int head=0;

        while (right<s.length()){
            char rightPointer = s.charAt(right);
            if(map.containsKey(rightPointer)){
                map.put(rightPointer,map.get(rightPointer)-1);
                if(map.get(rightPointer)==0){
                    counter--;
                }
            }
            right++;
            while (counter==0){
                char leftPointer = s.charAt(left);
                if(map.containsKey(leftPointer)){
                    map.put(leftPointer,map.get(leftPointer)+1);
                    if(map.get(leftPointer)>0){
                        counter++;
                    }
                }
                if(right-left<len){
                    len = right-left;
                    head = left;
                }
                left++;
            }
        }
        if(len==Integer.MAX_VALUE)return"";

        return s.substring(head,head+len);


    }
}
