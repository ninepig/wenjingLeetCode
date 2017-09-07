package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/3.
 */
public class FirstUniqueCharInString {
    public int firstUniqChar(String s) {
            if(s==null||s.length()==0){
                return -1;
            }
            int[] helper = new int[26];

            for (char a :s.toCharArray()){
                helper[a-'a']++;
            }
            for (int i = 0 ; i<s.length();i++){
                char thisChar = s.charAt(i);
                if(helper[thisChar-'a']==1){
                    return i;
                }
            }
            return -1;
    }
}
