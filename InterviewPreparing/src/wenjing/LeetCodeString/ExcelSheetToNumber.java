package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-18.
 */
public class ExcelSheetToNumber {
    public int titleToNumber(String s) {
        int result = 0;

        for(int i = 0;i<s.length();i++){
            int thisNumber = s.charAt(i)-'A'+1;
            result = result*26+thisNumber;
        }

        return result;
    }
}
