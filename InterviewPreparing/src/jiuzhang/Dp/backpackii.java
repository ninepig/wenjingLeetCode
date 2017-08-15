package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/15.
 *Given n items with size Ai and value Vi, and a backpack with size m. What's the maximum value can you put into the backpack?

 Notice

 You cannot divide item into small pieces and the total size of items you choose should smaller or equal to m.

 Have you met this question in a real interview? Yes
 Example
 Given 4 items with size [2, 3, 5, 7] and value [1, 5, 2, 4], and a backpack with size 10. The maximum value is 9.
 */
public class backpackii {
    public int backPackII(int m, int[] A, int V[]) {
        if(m<=0){
            return 0;
        }
        if(A==null||A.length==0){
            return 0;
        }

        //state, max value of i th pack  which can fullfill j size
        int[][] value = new int[A.length+1][m+1];

        //initial state
        for(int i = 0 ;i<=A.length+1;i++){
            value[i][0] = 0;
        }

        //state transfer

        for(int i = 1;i<=A.length+1;i++){
            for(int j = 0 ; j<= m;j++){
                //装得下,A[i-1] size of ith V[i-1] Value of ith
                if(j-A[i-1]>=0){
                    value[i][j] = Math.max(value[i-1][j],(value[i-1][j-A[i-1]]+V[i-1]));
                }else {
                    value[i][j] = value[i-1][j];
                }
            }
        }

        return value[A.length][m];

    }
}
