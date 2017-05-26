package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-18.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if(s==null||s.length()<=1){
            return true;
        }

        int l = 0 ;
        int r = s.length()-1;
        //有可能出现大小写的问题，所以要把大小写转成一样的
        s =s.toLowerCase();
        while (l+1<=r){
            while (l+1<=r && (!isAlph(s.charAt(l)))){
                l++;
            }
            while (l+1<=r &&(!isAlph(s.charAt(r)))){
                r--;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

    private boolean isAlph(char c) {

        return (c>='a'&&c<='z')||(c>='0'&&c<='9')||(c>='A'&&c<='Z');

    }


}
