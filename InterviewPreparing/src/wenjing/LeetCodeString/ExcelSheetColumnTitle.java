package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-18.
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        if(n<=0){
            return "";
        }
        int remider = 0;
        StringBuffer sb =new StringBuffer();
        while (n>0){
            remider = (n-1)%26;
            sb.insert(0,(char)('A'+remider));
            n = (n-1)/26;
        }
        return sb.toString();
    }

}
