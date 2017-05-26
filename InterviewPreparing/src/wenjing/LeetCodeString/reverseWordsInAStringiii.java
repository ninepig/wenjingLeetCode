package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-20.
 *Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 */


public class reverseWordsInAStringiii {
    public String reverseWords(String s) {
            if(s.length()==0||s == null){
                return "";
            }

            String[] splitResult = s.split(" ");
            StringBuffer result = new StringBuffer();

            for(int i = 0;i<splitResult.length;i++){
                result.append(reverse(splitResult[i]));
                if(i!=splitResult.length-1){
                    result.append(" ");
                }
            }

            return  result.toString();
    }

    private String reverse(String thisS) {

        StringBuffer sb  = new StringBuffer();
        for(int i=thisS.length()-1;i>=0;i--){
            sb.append(thisS.charAt(i));
        }
        return sb.toString();
    }

    public String reverseWords2(String s)
    {
        char[] s1 = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s1.length; j++)
        {
            if(s1[j] == ' ')
            {
                reverse2(s1, i, j - 1);
                i = j + 1;
            }
        }
        reverse2(s1, i, s1.length - 1);
        return new String(s1);
    }

    public void reverse2(char[] s, int l, int r)
    {
        while(l < r)
        {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++; r--;
        }
    }


}
