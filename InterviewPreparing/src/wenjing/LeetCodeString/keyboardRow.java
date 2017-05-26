package wenjing.LeetCodeString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-04-20.
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 */
public class keyboardRow {

    public class Solution
    {
        public String[] findWords(String[] words)
        {
            List<String> list = new ArrayList<>();
            String row1 = "QWERTYUIOPqwertyuiop";
            String row2 = "ASDFGHJKLasdfghjkl";
            String row3 = "ZXCVBNMzxcvbnm";

            for(int i = 0; i < words.length; i++)
            {
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                String word = words[i];
                for(int j = 0 ; j < word.length(); j++)
                {
                    if(row1.contains(word.charAt(j)+""))
                    {
                        count1++;
                    }
                    if(row2.contains(word.charAt(j)+""))
                    {
                        count2++;
                    }
                    if(row3.contains(word.charAt(j)+""))
                    {
                        count3++;
                    }
                }

                if(count1 == word.length() || count2 == word.length() || count3 == word.length())
                {
                    list.add(word);
                }

            }

            return list.toArray(new String[list.size()]);
        }
    }




}
