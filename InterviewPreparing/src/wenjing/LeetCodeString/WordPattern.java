package wenjing.LeetCodeString;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-07.
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {

        if(pattern==null||pattern.length()<=0||str==null||str.length()<=0){
            return false;
        }
        String[] splitString = str.split(" ");
        if(splitString.length != pattern.length()){
            return false;
        }

        HashMap<Character,String> hm = new HashMap<>();
        for(int i = 0;i<pattern.length();i++){
            char thisChar = pattern.charAt(i);
            if(hm.containsKey(thisChar)){
                if(!hm.get(thisChar).equals(splitString[i])){
                    return false;
                }else {
                    continue;
                }
            }else {
                if(!hm.containsValue(splitString[i])){
                    hm.put(thisChar,splitString[i]);
                }else {
                    return false;
                }
            }
        }
        return true;
    }

}
