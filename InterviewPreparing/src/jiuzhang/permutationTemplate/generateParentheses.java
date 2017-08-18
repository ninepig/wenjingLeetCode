package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/8/16.
 * 利用模板，这个其实就是回溯法，（backtracking）
 * 因为一共有个N个括号组，所以结束条件就是 字符串长度等于2*N
 * 不断的增加（ ，然后） 肯定可以获得答案。
 * 维护2个数值，左括号的数量，以及右括号的数量，
 * 如果左括号少于N ，增加左括号，右括号数量少于左括号，增加右括号。不断回溯。得到全部答案
 *
 */
public class generateParentheses {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
         generateHelper(result,"",0,0,n);
         return result;
    }

    private void generateHelper(List<String> result, String s, int leftPaNumber, int rightPaNumber, int n) {
        if(s.length()==n*2){
            result.add(s);
        }else {
            if(leftPaNumber<n){
                generateHelper(result,s+"(",leftPaNumber+1,rightPaNumber,n);
            }
            if(rightPaNumber<leftPaNumber){
                generateHelper(result,s+")",leftPaNumber,rightPaNumber+1,n);
            }
        }
    }
}
