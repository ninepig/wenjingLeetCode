package secondTime;

/**
 * Created by yamengwenjing on 2017-05-04.
 */
public class climbingStaris {

    public int climbStairs(int n) {

      if(n<=2){
          return n;
      }
      int[] result = new int[n+1];
        result[0]=0;
        result[1] =1;
        result[2]=2;
        for(int i = 3;i<n+1;i++){
            result[i] = result[i-1]+result[i-2];
        }

    return result[n];

    }


}
