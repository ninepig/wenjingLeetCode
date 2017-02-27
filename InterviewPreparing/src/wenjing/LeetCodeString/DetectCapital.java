package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-02-23.
 */
/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class DetectCapital {
    /*
    暴力法，给予2个flag，考虑各种情况，做出结果
     */
    public boolean detectCapitalUse(String word) {
            if(word.length()==1){
                return true;
            }
            boolean fistCharFlag ;
            boolean secondCharFlag;

            fistCharFlag = Character.isUpperCase(word.charAt(0));
            secondCharFlag = Character.isUpperCase(word.charAt(1));
            if(fistCharFlag){
                if(secondCharFlag){
                    for(int i = 2;i<word.length();i++){
                        if(Character.isLowerCase(word.charAt(i))){
                            return false;
                        }
                    }
                    return  true;
                }else{
                    for(int i = 2;i<word.length();i++){
                        if(Character.isUpperCase(word.charAt(i))){
                            return false;
                        }
                    }
                    return  true;
                }
            }else{
                for(int i = 1;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                return  true;
            }


    }


}
