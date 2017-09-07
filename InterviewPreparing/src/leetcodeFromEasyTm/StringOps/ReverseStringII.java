package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/5.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {

        if(s==null||s.length()==0){
            return s;
        }
        //revese n+k-1 or length -1
        char[] chars = s.toCharArray();
        int pos = 0;
        int length = s.length();

        while (pos<length){
            int lastPost = Math.min(pos+k-1,length-1);
            swap(chars,pos,lastPost);
            pos += 2*k;
        }

        return new String(chars);
    }

    public void swap(char[] chars , int begin , int end){
        while (begin<end){
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
    }

}
