package leetcodeFromEasyTm.dp;

/**
 * Created by yangw on 2017/9/6.
 */
public class climbingStairs {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i<n ; i++){
            dp[i]=dp[i-2]+dp[i-1];
        }

        return dp[n-1];
    }
}
