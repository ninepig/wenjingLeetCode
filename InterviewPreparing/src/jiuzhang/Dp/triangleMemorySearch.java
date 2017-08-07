package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/7.
 */
public class triangleMemorySearch {
    private int n;
    private int[][] minSum;
    private int[][] triangle;

    public int minimumTotal(int[][] triangle){
        if(triangle == null||triangle.length==0){
            return 0;
        }
        if(triangle[0]==null || triangle[0].length==0){
            return 0;
        }
        this.n = triangle.length;
        this.triangle = triangle;
        this.minSum = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                minSum[i][j] = Integer.MAX_VALUE;
            }
        }
        return search(0,0);
    }
    private int search(int x, int y) {
        if (x >= n) {
            return 0;
        }
        if (minSum[x][y] != Integer.MAX_VALUE) {
            return minSum[x][y];
        }
        minSum[x][y] = Math.min(search(x + 1, y), search(x + 1, y + 1))
                + triangle[x][y];
        return minSum[x][y];
    }
}
