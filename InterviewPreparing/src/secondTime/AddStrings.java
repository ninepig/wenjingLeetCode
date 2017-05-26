package secondTime;

/**
 * Created by yamengwenjing on 2017-05-03.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
            if(num1==null&&num2==null){
                return null;
            }
            int carry=0;
            StringBuffer resultSB = new StringBuffer();
            int l1 = num1.length()-1;
            int l2 = num2.length()-1;

            while (l1>=0&&l2>=0){
                int sum = (num1.charAt(l1)-'0')+(num2.charAt(l2)-'0')+carry;
                int digit  = sum%10;
                carry = sum/10;
                resultSB.append(digit);
                l1--;
                l2--;
            }
            while (l1>=0){
                int sum = (num1.charAt(l1)-'0')+carry;
                int digit  = sum%10;
                carry = sum/10;
                resultSB.append(digit);
                l1--;
            }

        while (l2>=0){
            int sum = (num2.charAt(l1)-'0')+carry;
            int digit  = sum%10;
            carry = sum/10;
            resultSB.append(digit);
            l2--;
        }

        if(carry!=0){
            resultSB.append(carry);
        }

        return resultSB.reverse().toString();


    }


}
