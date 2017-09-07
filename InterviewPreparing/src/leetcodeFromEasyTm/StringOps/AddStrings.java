package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/5.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        if(num1==null){
            return num2;
        }
        if(num2==null){
            return num1;
        }

        // for result;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;

        while (length1>=0&&length2>=0){
            int add1 = num1.charAt(length1)-'0';
            int add2 = num2.charAt(length2)-'0';
            int reminder = (add1+add2+carry)%10;
            sb.insert(0,reminder);
            carry = (add1+add2+carry)/10;
            length1--;
            length2--;
        }
        while (length1>=0){
            int add = num1.charAt(length1)-'0';
            int reminder = (add+carry)%10;
            sb.insert(0,reminder);
            carry = (add+carry)/10;
            length1--;
        }
        while (length2>=0){
            int add = num2.charAt(length2)-'0';
            int reminder = (add+carry)%10;
            sb.insert(0,reminder);
            carry = (add+carry)/10;
            length2--;
        }

        if(carry!=0){
            sb.insert(0,carry);
        }

        return sb.toString();

    }


}
