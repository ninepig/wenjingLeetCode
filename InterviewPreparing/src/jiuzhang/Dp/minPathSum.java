package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/7.
 */
public class minPathSum {
    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        if(grid[0]==null||grid[0].length==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] sumState = new int[m][n];
        //init
        sumState[0][0] = grid[0][0];

        for(int i = 1 ;i<m;i++){
            sumState[i][0] = sumState[i-1][0]+grid[i][0];
        }
        for(int i = 1 ;i<n;i++){
            sumState[0][i] = sumState[0][i-1]+grid[0][i];
        }

        for (int i = 1;i<m;i++){
            for (int j = 1;j<n;j++){
                sumState[i][j] = Math.min(sumState[i-1][j],sumState[i][j-1])+grid[i][j];
            }
        }

        return sumState[m-1][n-1];
//        if (grid == null || grid.length == 0 || grid[0].length == 0) {
//            return 0;
//        }
//
//        int M = grid.length;
//        int N = grid[0].length;
//        int[][] sum = new int[M][N];
//
//        sum[0][0] = grid[0][0];
//
//        for (int i = 1; i < M; i++) {
//            sum[i][0] = sum[i - 1][0] + grid[i][0];
//        }
//
//        for (int i = 1; i < N; i++) {
//            sum[0][i] = sum[0][i - 1] + grid[0][i];
//        }
//
//        for (int i = 1; i < M; i++) {
//            for (int j = 1; j < N; j++) {
//                sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
//            }
//        }
//        return sum[M - 1][N - 1];

    }
}
