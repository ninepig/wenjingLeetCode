package wenjing.LeetCodeString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-28.
 */
public class StringCombination {
    public static void main(String ss[]) {
        perm("123");
        System.out.println();
    }

    // 求字符串中所有字符的组合abc>a,b,c,ab,ac,bc,abc
    public static void perm(String s) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= s.length(); i++) {
            perm(s, i, result);
        }
    }

    // 从字符串s中选择m个字符
    public static void perm(String s, int m, List<String> result) {

        // 如果m==0，则递归结束。输出当前结果
        if (m == 0) {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
            }
            System.out.println();
            return;
        }

        if (s.length() != 0) {
            // 选择当前元素
            result.add(s.charAt(0) + "");
            perm(s.substring(1, s.length()), m - 1, result);
            result.remove(result.size() - 1);
            // 不选当前元素
            perm(s.substring(1, s.length()), m, result);
        }
    }
}
/**
 * 这个用string buffer的 自己写的
 * 对于组合而言
 * 和排列一样，递归解决问题
 * 但是有两种情况
 * 1 选取当前位字符，对于剩下的n-1的字符串，选M-1个字符
 * 2 不选取当前的字符，对于剩下的N-1字符串，选取M个字符
 *  递归结束条件，就是M=0 （即满足要输出的位数）
 *
 *
 *
 *
 */
//public class COMBINATION {
//    public static void main(String ss[]) {
//        perm("123");
//        System.out.println();
//    }
//
//    // 求字符串中所有字符的组合abc>a,b,c,ab,ac,bc,abc
//    public static void perm(String s) {
////        List<String> result = new ArrayList<String>();
//        StringBuffer outPutBuffer = new StringBuffer();
//        for (int i = 1; i <= s.length(); i++) {
//            perm(s, i, outPutBuffer);
//        }
//    }
//
//    // 从字符串s中选择m个字符
//    public static void perm(String s, int m, StringBuffer result) {
//
//        // 如果m==0，则递归结束。输出当前结果
//        if (m == 0) {
////            for (int i = 0; i < result.size(); i++) {
////                System.out.print(result.get(i));
////            }
//            System.out.println(result.toString());
//            return;
//        }
//
//        if (s.length() != 0) {
//            // 选择当前元素
////            result.add(s.charAt(0) + "");
//            result.append(s.charAt(0));
//            perm(s.substring(1, s.length()), m - 1, result);
////            result.remove(result.size() - 1);
//            result.deleteCharAt(result.length()-1);
//            // 不选当前元素
//            perm(s.substring(1, s.length()), m, result);
//        }
//    }
//}