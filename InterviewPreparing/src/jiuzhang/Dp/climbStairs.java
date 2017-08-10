package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/8.
 */
public class climbStairs {
    public int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] pathSum = new int[n];
        pathSum[0] = 1;
        pathSum[1] = 2;
        for(int i = 2;i<n;i++){
            pathSum[i] = pathSum[i-1]+pathSum[i-2];
        }
        return pathSum[n-1];
    }
}
