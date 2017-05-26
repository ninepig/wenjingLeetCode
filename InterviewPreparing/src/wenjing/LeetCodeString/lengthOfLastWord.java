package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-11.
 */
public class lengthOfLastWord {

    public int lengthOfLastWord(String s) {
            if(s==null||s.length()<=0){
                return 0;
            }
            String[] stringSplit = s.split(" ");
        if(stringSplit.length>1) {
            String lastWord = stringSplit[stringSplit.length - 1];
            return lastWord.length();
        }
        return 0;


    }




}
