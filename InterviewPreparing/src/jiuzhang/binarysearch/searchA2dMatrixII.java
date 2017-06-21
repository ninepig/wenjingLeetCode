package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/14.
 */
public class searchA2dMatrixII {
    /*
    这道题相当于没有使用那个模板，而是不断逼近，也算是二分法的一种。
    因为没有使用那个模板，所以循环结束以后不需要判断，要不然就错了。这个是准确定位的循环，关键是把图画出来
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        if(matrix[0]==null||matrix[0].length==0){
            return  false;
        }
        int row = matrix.length;
        int column = matrix[0].length-1;
        int x = row-1;
        int y = 0;

        while (x>=0&&y<=column){
            if(matrix[x][y]==target){
                return true;
            }else if(matrix[x][y]>target) {
                x--;
            }else {
                y++;
            }
        }
            return false;


    }
}
