package leetcodeFromEasyTm.array;

/**
 * Created by yangw on 2017/9/6.
 */
public class plusOne {
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0){
            return new int[]{};
        }
        int carry = 0;
        boolean lastPo = true;
        for(int i = digits.length -1; i >= 0 ; i--){
            if (lastPo){
               int reminder = (digits[i]+1)%10;
               carry = (digits[i]+1)/10;
               digits[i] = reminder;
               lastPo =false;
            }else {
                int reminder =(digits[i]+carry)%10;
                carry = (digits[i]+carry)/10;
                digits[i] = reminder;
            }
        }
        if(carry==0){
            return digits;
        }

        int[] result = new int[digits.length+1];
        result[0] = 1 ;
        for (int i = 1; i< result.length;i++){
            result[i] = digits[i-1];
        }
        return result;



    }
}
