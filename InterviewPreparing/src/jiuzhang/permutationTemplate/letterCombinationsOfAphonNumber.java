package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/28.
 * 算是自己做出来的一个题，用的模板
 * 维护一个mapping 的string list
 * 中间出了点问题
 * 关键是取出第一个mappinglist ，然后取下一个
 */
public class letterCombinationsOfAphonNumber {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        StringBuffer currentResult = new StringBuffer();

        letterComHelper(result, currentResult, mapping, digits, 0);

        return result;


    }

    /*
有问题 ，不应该是两层循环，把最外层的for循环去掉，每次获取digits的下一位字符既可以了！，自己的思路是正确的！在postion的理解上有问题
 */
    private void letterComHelper(List<String> result, StringBuffer currentResult, String[] mapping, String digits, int position) {
        if (currentResult.length() == digits.length()) {
            result.add(currentResult.toString());
        } else {
//            for(int i=position;i<digits.length();i++){
            int mappingPosition = Character.getNumericValue(digits.charAt(position));
            //这个相当于取当前数组的过程，因为abc 就相当于我们的第一层ad ae af bd be bf 是这样排列下去的
            String mappingResult = mapping[mappingPosition];
            for (char singleChar : mappingResult.toCharArray()) {
                //这个就稍微不一样一些 对于当前I的循环，我们考虑的是加入这一层对应的3个字符，
                currentResult.append(singleChar);
                //虽然这里是postion+1 实质上还是i+1，因为是对于那个数组而言 这就是i+1,
                letterComHelper(result, currentResult, mapping, digits,position + 1);
                currentResult.deleteCharAt(currentResult.length() - 1);
            }
        }
//        }
    }
}


