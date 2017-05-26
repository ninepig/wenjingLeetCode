package secondTime;

/**
 * Created by yamengwenjing on 2017-04-24.
 */
public class islandPerimeter {
    public int islandPerimeter(int[][] grid) {

        if(grid==null){
            return 0;
        }

        int islandNumber = 0;
        int neiNumber = 0;

        for(int i =0 ; i<grid.length;i++){
            for(int j =0 ; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    islandNumber++;

                    if(i+1<grid.length&&grid[i+1][j]==1){
                        neiNumber++;
                    }
                    if(j+1<grid[i].length&&grid[i][j+1]==1){
                        neiNumber++;
                    }

                }
            }
        }
        return islandNumber*4-neiNumber*2;

    }

}
