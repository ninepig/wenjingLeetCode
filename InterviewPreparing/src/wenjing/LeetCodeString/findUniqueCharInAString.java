package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-02-26.
 */
public class findUniqueCharInAString {

    public int firstUniqChar(String s) {
        if(s==null||s.length()==0){
            return -1;
        }
        int[] charArray = new int[26];
        for(int i = 0;i<s.length();i++){
            charArray[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(charArray[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

}
