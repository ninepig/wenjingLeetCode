package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/7.
 */
public class triangle {
    // from top to bottom
    public int minimumTotalFromTopToBottom(int[][] triangle) {
        if(triangle==null||triangle.length==0){
            return 0;
        }
        if(triangle[0]==null||triangle[0].length==0){
            return 0;
        }
        int length = triangle.length;
        int[][] f = new int[length][length];

        //initial state. distance from i to i+1 layer
        f[0][0] = triangle[0][0];
        for(int i =1;i<length;i++){
            f[i][0] = f[i-1][0]+triangle[i][0];
            f[i][i] = f[i-1][i-1]+triangle[i][i];
        }

        //state relationship, finding --- state[i][j] means min distance from i--j.
        // f[i][j] = 从上一层i-1 到这一层i 任意一个点最短的
        for(int i = 1;i<length;i++){
            for(int j = 1;j<i;j++){
                f[i][j]=Math.min(f[i-1][j],f[i-1][j-1])+triangle[i][j];
            }
        }

        //answer 最后一层所有值 最小的点
        int best = f[length-1][0];
        for(int i = 1;i<length;i++){
            best = Math.min(best,f[length-1][i]);
        }
        return best;
    }
    // from top to bottom
    public int minimumTotalFromBottomToTop(int[][] triangle) {
        if(triangle==null||triangle.length==0){
            return 0;
        }
        if(triangle[0]==null||triangle[0].length==0){
            return 0;
        }
        int length = triangle.length;
        int[][] f = new int[length][length];

      //init
        for(int i= 0;i<length;i++ ){
            f[length-1][i] = triangle[length-1][i];
        }
        // f is the state record from bottom to up value.
        for(int i = length-2;i>=0;i--){
            for(int j = 0;j<=i;i++){
                f[i][j] = Math.min(f[i+1][j],f[i+1][j+1])+triangle[i][j];
            }
        }
        return f[0][0];
    }



}
