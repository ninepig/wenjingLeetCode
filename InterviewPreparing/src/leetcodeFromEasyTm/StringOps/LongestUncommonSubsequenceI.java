package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/1.
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String A, String B) {
        // write your code here

        return A.equals(B)? -1 : Math.max(A.length(),B.length());
    }
}
