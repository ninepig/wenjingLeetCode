package leetcodeFromEasyTm.bit;

/**
 * Created by yangw on 2017/9/1.
 */
public class findTheDifference {
    public char findTheDifference(String s, String t) {

        if(s==null||s.length() == 0){
            return t.charAt(0);
        }

        char result = t.charAt(t.length()-1);

        for(int i = 0 ;i <s.length();i++){
            result^=s.charAt(i);
            result^=t.charAt(i);
        }

        return  result;

    }
}
