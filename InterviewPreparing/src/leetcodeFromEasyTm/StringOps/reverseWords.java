package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/8/31.
 */
public class reverseWords {
    public String reverseWords(String s) {
            if(s==null||s.length()==0){
                return "";
            }
            String[] words = s.split(" ");
            StringBuffer resultSb = new StringBuffer();
            StringBuffer reverseHelper = new StringBuffer();
            for(int i = 0 ; i< words.length;i++){
                resultSb.append(reverseHelper.append(words[i]).reverse().toString());
                reverseHelper.delete(0,words[i].length());
                if(i!=words.length-1){
                    resultSb.append(" ");
                }
            }
            return resultSb.toString();

    }
}
