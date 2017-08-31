package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/8/31.
 */
public class reverseString {
    //如果可以用stringbuffer的话
    public String reverseStringStringBuffer(String s) {
        return new StringBuffer().append(s).reverse().toString();
    }
    //不可以的话
    public String reverseString(String s) {
        if(s==null||s.length()==0){
            return "";
        }

        char[] stringArray = s.toCharArray();
        int l = 0;
        int r = s.length()-1;

        while (l<r){
            char temp = stringArray[l];
            stringArray[l] = stringArray[r];
            stringArray[r]= temp;
            l++;
            r--;
        }

        return new String(stringArray);

    }
}
