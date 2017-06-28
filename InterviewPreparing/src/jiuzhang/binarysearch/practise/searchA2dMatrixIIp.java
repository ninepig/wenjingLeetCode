package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/22.
 */
public class searchA2dMatrixIIp {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix==null){
            return false;
        }
        if(matrix[0].length==0||matrix[0]==null){
            return false;
        }
        int x = matrix.length-1;
        int y = 0 ;
        while (x>=0&&y<=(matrix[0].length-1)){
            if(matrix[x][y]==target){
                return true;
            }else if(matrix[x][y]<target){
                y++;
            }else {
                x--;
            }
        }

        return false;



    }
}