package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-03-05.
 */
public class addStrings {
    public String addStrings(String num1, String num2){
        StringBuffer result = new StringBuffer();
        int carry = 0;
        int i=num1.length()-1 ,j = num2.length()-1;

        for(;i>=0&&j>=0;i--,j--){
            result.append((num1.charAt(i)-'0' + num2.charAt(j)-'0'+carry)%10);
            carry = (num1.charAt(i)-'0' + num2.charAt(j)-'0'+carry)/10;
        }
        while (i>=0){
            result.append((num1.charAt(i)-'0' +carry)%10);
            carry = (num1.charAt(i)-'0'+carry)/10;
            i--;
        }
        while (j>=0){
            result.append((num2.charAt(j)-'0' +carry)%10);
            carry = (num2.charAt(j)-'0'+carry)/10;
            j--;
        }
        if(carry!=0){
            result.append(carry);
        }

        return  result.reverse().toString();
    }
}
