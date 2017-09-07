package leetcodeFromEasyTm.Math;

/**
 * Created by yangw on 2017/9/2.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
            if (s==null||s.length()==0){
                return 0;
            }

            int result = 0;
            char[] array = s.toCharArray();

            for (int i = 0 ; i< array.length ; i ++){
                int currentChar = array[i] - 'A'+1;
                result = result*26+currentChar;
            }

            return result;
    }
}
