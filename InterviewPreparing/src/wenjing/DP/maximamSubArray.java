package wenjing.DP;

/**
 * Created by yamengwenjing on 2017-03-22.
 */
public class maximamSubArray {
    public int maxSubArray(int[] A) {
        if(A==null || A.length==0)
            return 0;
        int global = A[0];
        int local = A[0];
        for(int i=1;i<A.length;i++)
        {
            local = Math.max(A[i],local+A[i]);
            global = Math.max(local,global);
        }
        return global;
    }
}
