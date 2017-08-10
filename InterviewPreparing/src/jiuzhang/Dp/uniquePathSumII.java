package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/8.
 */
public class uniquePathSumII{
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0){
                return 0;
            }
            int height = obstacleGrid.length;
            int width = obstacleGrid[0].length;
            int[][] sumPath = new int[height][width];

            for(int i = 0;i<height;i++){
                if(obstacleGrid[i][0]!=1){
                    sumPath[i][0]=1;
                }else {
                    //在边上只要一旦出现了 1 ，则说明这条边不会走下去了，sumPath 肯定是0，如果你设0，则会继续走下去，一旦看到剩余的obSTACLEgrid,会设为1
                    //sumPath[i][0]= 0
                    break;
                }
            }
            for(int i = 0;i<width;i++){
                if(obstacleGrid[0][i]!=1){
                    sumPath[0][i]=1;
                }else {
                    //sumPath[i][0]= 0
                    break;
                }
            }

            for(int i = 1 ; i <height ;i++){
                for(int j = 1;j<width;j++){
                    if(obstacleGrid[i][j]!=1){
                        sumPath[i][j]= sumPath[i-1][j]+sumPath[i][j-1];
                    }else {
                        sumPath[i][j]=0;
                    }
                }
            }

            return sumPath[height-1][width-1];
        }
}
