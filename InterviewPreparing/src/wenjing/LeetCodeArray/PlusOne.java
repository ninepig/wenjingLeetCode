package wenjing.LeetCodeArray;

import java.util.ArrayList;

/**
 * Created by yamengwenjing on 2016-11-16.
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0){
            return digits;
        }
        int carry = 0;
        int digitNumber=0;
        boolean firstTime = true;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--){
                if(firstTime) {
                    digitNumber = (digits[i] + 1 + carry) % 10;
                    carry = (digits[i]+1+carry)/10;
                    firstTime = false;
                }else {
                    digitNumber = (digits[i] + carry) % 10;
                    carry = (digits[i]+carry)/10;
                }

                result.add(0,digitNumber);
        }
        if(carry>0){
            result.add(0,1);
        }
        int[] resultArray = new int[result.size()];
        for(int j = 0;j<result.size();j++){
            resultArray[j] = result.get(j);
        }

        return resultArray;

    }

    public int[] plusOne2(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }


}
