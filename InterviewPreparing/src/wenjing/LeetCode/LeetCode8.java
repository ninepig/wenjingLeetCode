package wenjing.LeetCode;

/**
 * Created by yamengwenjing on 2016-11-20.
 */
public class LeetCode8 {
    public int myAtoi(String str){
        //if string is null ,return 0
        if(str == null){
            return 0;
        }
        int sign = 0;// 1 means positive -1 means negative
        long result = 0;// we need use long type, because it could be a integer greater than max of integer.

        str = str.trim(); // remove all the leading and tailing white space
        char[] charArray = str.toCharArray(); // trans in to a charArray

        //loop charArray
        for(char thisChar: charArray){

            //judge sign , for sign, it can only show up once , second time it showing up, we just break the loop
            // give sign a value to store it is negtive or positive
            if(thisChar == '+'){
                if(sign!=0){
                    break;
                }
                sign = 1;
            }else if (thisChar == '-'){
                if(sign!=0){
                    break;
                }
                sign=-1;
            } else if(thisChar>='0'&&thisChar<='9'){
                // get the number between 0 - 9, we use times 10 then add the new digit to get the final number
                result *=10;
                result += thisChar-'0';
                // bondary consider
                if(result>Integer.MAX_VALUE){
                    if(sign>=0){
                        return  Integer.MAX_VALUE;
                    }else{
                        return  Integer.MIN_VALUE;
                    }
                }
            }else {
                // if there is other char , break the loop
                break;
            }
        }
        // use sign to return the result
        if(sign>=0){
            return  (int)result;
        }else {
            return (int)-result;
        }
    }
}
