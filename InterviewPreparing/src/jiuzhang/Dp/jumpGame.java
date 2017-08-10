package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/9.
 */
public class jumpGame {
    //dynamic programming
    public boolean canJump(int[] A) {
        if(A==null||A.length==0){
            return false;
        }
        boolean[] can = new boolean[A.length];
        //第一步肯定是可以跳到第二步的 要不这个题目就没有意义了，因为A[0]要是等于0 就没有了
        can[0] = true;
        for(int i = 1 ; i<A.length;i++){
            for(int j = 0 ; j<i;j++){
                if(can[j]==true&&j+A[j]>=i){
                    can[j]=true;
                    break;
                }
            }
        }
        return can[A.length-1];
    }
    //gready programming
    public boolean canJumpGreedy(int[] A){
        if(A==null||A.length==0){
            return false;
        }
        //maximum value to reach, A[i]+i is the maximum value to jump from i node
        int reach = 0;
        for(int i = 0 ; i<=reach&&i<A.length;i++){
            reach = Math.max(A[i]+i,reach);
        }
        if(reach<A.length-1){
            return false;
        }
        return true;
    }

}
