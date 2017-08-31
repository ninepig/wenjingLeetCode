package leetcodeFromEasyTm.StringOps;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yangw on 2017/8/31.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {

        if(words==null||words.length==0){
            return new String[0];
        }
        String row1 = "qawertyuiopQAWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 ="zxcvbnmZXCVBNM";

        ArrayList<String> result = new ArrayList<>();

        for (String word:words){
            int count1 = 0,count2=0,count3=0;

            for (int j = 0 ; j<word.length(); j++){

                if (row1.contains(word.charAt(j)+"")){
                    count1++;
                }
                if (row2.contains(word.charAt(j)+"")){
                    count2++;
                }
                if (row3.contains(word.charAt(j)+"")){
                    count3++;
                }

            }

            if(count1==word.length()||count1==word.length()||count1==word.length()){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
