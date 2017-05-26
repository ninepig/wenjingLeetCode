package secondTime;

/**
 * Created by yamengwenjing on 2017-04-25.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        if(s==null||t==null){
            return ' ';
        }
        if(s.length()==0||t.length()==1){
            return t.charAt(0);
        }
        int resultChar = t.charAt(0);
        for(int i = 0;i<s.length();i++){
            resultChar ^= s.charAt(i);
            resultChar ^= t.charAt(i+1);
        }
        return (char) resultChar;
    }
}
