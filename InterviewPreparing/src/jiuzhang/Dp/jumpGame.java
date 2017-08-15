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
        //can present if it can be jump to index  ith from A.
        can[0] = true;
        for(int i = 1 ; i<A.length;i++){
            for(int j = 0 ; j<i;j++){
                if(can[j]==true&&j+A[j]>=i){
                    can[i]=true;
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
