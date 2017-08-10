package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/8.
 */
public class uniquePath {
    public int uniquePaths(int m, int n) {
            if(m == 1 || n ==1 ){
                return 1;
            }
            int[][] pathSum = new int[m][n];

            //init , path number of the node on edge is one
             for(int i = 0;i<m;i++){
                pathSum[i][0]=1;
            }
            for(int i =0 ;i<n;i++){
                pathSum[0][i]=1;
            }
            for(int i=1;i<m;i++){
                for(int j = 1;j<n;j++){
                    pathSum[i][j] = pathSum[i-1][j]+pathSum[i][j-1];
                }
            }

            return pathSum[m-1][n-1];

    }
}
