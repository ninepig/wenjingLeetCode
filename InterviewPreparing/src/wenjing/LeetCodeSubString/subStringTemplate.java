package wenjing.LeetCodeSubString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yamengwenjing on 2017-04-05.
 */
public class subStringTemplate {
    public List<String> slidingWindowsTemplate(String s,String t) {

        // inital a collection to store result
        List<String> result = new LinkedList<>();
        if (t.length() > s.length()) return result;

        // create a hashmap to save the Chars of the targetSubString
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // maintain a counter to check whether match the target string.
        int counter = map.size();
        //two pointer ,: begin : left pointer of window, end : righter pointer of windows
        int begin = 0, end = 0;
        // the length of the subString wich match the target STRING
        int len = Integer.MAX_VALUE;

        while (end < s.length()) {
            char c = s.charAt(end);//get a char
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);//plus or minus 1
                if (map.get(c) == 0) {
                    counter--;//modify the counter according the requirement (different condition)
                }
            }
            end++;
            //increase begin pointer to make it invalid/valid agagin
            while (counter == 0)//counter condition ,different question varys.
            {
                char tempc = s.charAt(begin);//choose the char at begin poter, not the end pointer
                if (map.containsKey(tempc)) {
                    map.put(tempc, map.get(tempc) + 1);//plus or minus one
                    if (map.get(tempc) > 0) counter++;
                }

                /* save / update(min/max) the result if find a target*/
                // result collections or result int value
                begin++;
            }


        }
        return result;
    }

}
