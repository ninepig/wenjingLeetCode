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
    //swap的方法效率更高 ！质的飞跃
    public String reverseStringSwap(String s){
        if(s==null||s.length()==0){
            return "";
        }
        int l = 0 ;
        int r = s.length()-1;
        char[] result = s.toCharArray();
        while (l<r){
            char temp = result[l];
            result[l] =result[r];
            result[r] = temp;
            l++;
            r--;
        }
        //不能用这个，char[] 的toString 没有实现，会变成乱码
//        return  result.toString();
        return  new String(result);
    }

}
