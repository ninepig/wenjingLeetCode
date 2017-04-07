package wenjing.LeetCodeSubString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yamengwenjing on 2017-04-04.
 * 用网上大神的模板来做这个题 sliding windows
 * 首先用一个hashmap 保存 targetstring的每一个CHAR
 * 关键是counter，也就是有几种char。而不是几个
 * 然后用2个pointer ， 一个是end pointer，一个是begin pointer， 这2个pointer 组成了sliding windows的左右两端
 * 先用end pointer，向右，找到一个windows 的 string ，包含了我们的目标string
 *然后用begin pointer 向右， 在这个windows ，如果发现第一个在我们targetString里的char，然后就计算end-begin 是否 和我们的targetString 长度一样，如果不一样，则说明 这个windows的beginPointer不行。中间有杂char
 *  右移end pointer，左移beginpoiter ，继续，直到 连续的一段String 满足我们target string 的要求。
 */
public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();

        int begin = 0, end = 0;
//        int head = 0;
//        int len = Integer.MAX_VALUE;


        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;

            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }

        }
        return result;
    }

}
