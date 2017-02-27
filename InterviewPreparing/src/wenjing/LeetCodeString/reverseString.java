package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-02-17.
 */
/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class reverseString {
    public String reverseString(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        StringBuffer result = new StringBuffer();
        for(int i = 1;i<=s.length();i++){
            result.append(s.charAt(s.length()-i));
        }

        return result.toString();
    }


}
