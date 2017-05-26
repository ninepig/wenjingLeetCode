package secondTime;

/**
 * Created by yamengwenjing on 2017-04-28.
 */
public class titleToNumber {
    public int titleToNumber(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0;
        for(int i = 0 ; i <s.length();i++){
            int current = s.charAt(i)-'A'+1;
            result = result*26+current;
        }
        return result;
    }

}
