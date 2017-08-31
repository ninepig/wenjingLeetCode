package leetcodeFromEasyTm.matrix;

/**
 * Created by yangw on 2017/8/31.
 * 同时这个也是一个广度优先的题，只考虑是island的右边和左边，不断走下去
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if(grid == null ||grid.length==0){
            return 0;
        }

        int islandNumber = 0;
        int neighbourNumber = 0;

        for(int i = 0 ; i < grid.length;i++){
            for (int j = 0 ; j <grid[0].length;j++){

                if(grid[i][j]==1){
                    islandNumber+=1;
                    if(j+1<grid[0].length&&grid[i][j+1]==1){
                        neighbourNumber +=1;
                    }
                    if(i+1<grid.length&&grid[i+1][j]==1){
                        neighbourNumber+=1;
                    }
                }

            }
        }
        return islandNumber*4 - neighbourNumber*2;

    }
}
