package wenjing.matrix;

/**
 * Created by yamengwenjing on 2017-02-17.
 *
 *
 */
/*
这个题没有好好想，但是看了答案就知道非常直观，要做的就是审题的时候考虑清楚这个周长和小岛的个数
周长可以等于 小岛的个数*4 减去他邻居的个数*2，其实应该做的是用枚举法找出一定的规律
发现这个规律，要做的就是循环整个matrix，对于当前点 他的右侧和下方 如果是1 的话 则他有neigbour

 */
public class islandPrimter {
    public int islandPerimeter(int[][] grid) {
        if(grid==null){
            return 0;
        }
        int neighbourCount = 0;
        int islandCount =0;
        for(int i = 0;i<=grid.length;i++){
            for(int j= 0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    islandCount++;
                    if(i<grid.length-1&&grid[i+1][j]==1)
                        neighbourCount++;
                    if(j<grid[i].length-1&&grid[i][j+1]==1)
                        neighbourCount++;
                }
            }
        }
        return islandCount*4-neighbourCount*2;

    }
}
