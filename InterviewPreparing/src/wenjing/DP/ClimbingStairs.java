package wenjing.DP;

/**
 * Created by yamengwenjing on 2017-03-22.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int[] storingArray = new int[n+1];

        storingArray[0] = 0;
        storingArray[1]= 1;
        storingArray[2] =2;

        for(int i = 3; i<n+1;i++){
            storingArray[i] = storingArray[i-1]+storingArray[i-2];
        }
        return storingArray[n];
    }

}
