package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-11.
 */
public class addBinaryString {
    //time exceeded
    public String addBinary(String a, String b) {

        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int aLength = a.length()-1;
        int bLength = b.length()-1;
        for(;aLength>=0&&bLength>=0;aLength--,bLength--){
//            carry = (a.charAt(aLength)-'0'+b.charAt(bLength)-'0')/2;
            int digit =  (a.charAt(aLength)-'0'+b.charAt(bLength)-'0'+carry)%2;
            carry = (a.charAt(aLength)-'0'+b.charAt(bLength)-'0')/2;
            sb.append(digit);
        }
        while (aLength>=0){
            int digit =  (a.charAt(aLength)-'0'+carry)%2;
            carry = (a.charAt(aLength)-'0')/2;
            sb.append(digit);
        }
        while (bLength>=0){
            int digit =  (b.charAt(bLength)-'0'+carry)%2;
            carry = (b.charAt(bLength)-'0')/2;
            sb.append(digit);
        }

        while (carry!=0){
            sb.append(carry);
        }

        return sb.reverse().toString();


    }
    //similar
    public String addBinary2(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int aLength = a.length()-1;
        int bLength = b.length()-1;
        for(;aLength>=0&&bLength>=0;aLength--,bLength--){
            int digit =  (a.charAt(aLength)-'0'+b.charAt(bLength)-'0'+carry)%2;
            carry = (a.charAt(aLength)-'0'+b.charAt(bLength)-'0')/2;
            sb.append(digit);
        }
        while (aLength>=0){
            int digit =  (a.charAt(aLength)-'0'+carry)%2;
            carry = (a.charAt(aLength)-'0')/2;
            sb.append(digit);
        }
        while (bLength>=0){
            int digit =  (b.charAt(bLength)-'0'+carry)%2;
            carry = (b.charAt(bLength)-'0')/2;
            sb.append(digit);
        }
        while (carry!=0){
            sb.append(carry);
        }

        return sb.reverse().toString();

    }
}
