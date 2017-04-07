package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-03-25.
 非常巧妙的方法
 1 如果要是一个repeatedpatten的话 这个pattern的长度肯定可以被字符串的长度整除
 2 由这个pattern 组成的字符串，重复整除数的次数，最终生成的string 是str的话 那就成立
 */
public class RepeatedSubStringPattern {
    public boolean repeatedSubstringPattern(String str) {
        if(str == null ||str.length()==0){
            return false;
        }
        int length  = str.length();
        //很关键的一点 必须从一半的位置开始，要不没有意义！
        for(int i = length/2;i>=1;i--){
            //i 是 pattern的长度，必须可以被字符串长度整除
            if(length%i==0){
                int times = length/i;
                StringBuffer sb = new StringBuffer();
                for(int j = 0;j<times;j++){
                    sb.append(str.substring(0,i));
                }
                if(sb.toString().equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
}
