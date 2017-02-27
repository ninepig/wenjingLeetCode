package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-02-27.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {

        if(s == null || s.length()==0){
            return 0;
        }

        int result = 0 ;

        for(int i=0;i<s.length();i++){
            int number = s.charAt(i)-'A'+1;
            result = result*26+number;

        }
        return result;
    }

}
