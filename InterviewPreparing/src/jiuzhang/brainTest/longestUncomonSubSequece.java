package jiuzhang.brainTest;

/**
 * Created by yangw on 2017/8/20.
 */
public class longestUncomonSubSequece {
    public int longestCommonSubsequence(String A, String B) {

            return A.equals(B) ? -1 : Math.max(A.length(),B.length());

    }
}
