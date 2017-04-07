package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-03-30.
 */
public class numbersOfSegmentsInString {
    //regular pattern
    public int countSegments(String s) {

        return ("x"+s).split(" +").length-1;

    }

    public int countSegment2(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0 ;
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i)!=' '&& (i==0||s.charAt(i-1)==' ')) {
                result++;
            }
        }
        return result;
    }
}
