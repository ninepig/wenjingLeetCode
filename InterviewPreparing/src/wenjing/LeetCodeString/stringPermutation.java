package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2016-11-28.
 *
 * 固定第一位字符串的字符
 * 调用递归得到下一位的全排列
 *     固定下一位字符
 *     调用递归得到下一位的全排列
 *   。。。
 *   形成递归
 *   以此类推
 *  结束条件是确实到达全部的字符串
 *  用一个stringbuffer 作为输出。 用一个临时数组 来判断该位是否被访问过。
 *
 *
 */
public class stringPermutation {
    public static void permute(String str) {
        int length = str.length();
        boolean[] used = new boolean[length];
        StringBuffer output = new StringBuffer(length);

        permutation(str, length, output, used, 0);

    }

    // @para
    // position : 下一个放置的元素位置,所以调入时候是0
    //
    static void permutation(String str, int length, StringBuffer output, boolean[] used, int position) {
        // end of the recursion
        if (position == length) {
            System.out.println(output.toString());
            return;
        } else {
            for (int i = 0; i < length; i++) {
                // skip already used characters
                if (used[i])
                    continue;
                // add fixed character to output, and mark it as used
                output.append(str.charAt(i));
                used[i] = true;

                // permute over remaining characters starting at position+1
                // recursion
                permutation(str, length, output, used, position + 1);
                // remove fixed character from output and unmark it
                output.deleteCharAt(output.length() - 1);
                used[i] = false;
            }
        }
    }
}
