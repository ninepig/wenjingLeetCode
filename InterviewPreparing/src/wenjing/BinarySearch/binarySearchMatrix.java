package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-22.
 * 写出一个高效的算法来搜索 m × n矩阵中的值。

 这个矩阵具有以下特性：

 每行中的整数从左到右是排序的。
 每行的第一个数大于上一行的最后一个整数。
 */
public class binarySearchMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        //use binray search twice
        // first time to get the right row
        //second try to get right column postion in that row.
        if(matrix==null|| matrix.length ==0 ){
            return false;
        }
        if(matrix[0]==null||matrix[0].length==0){
            return false;
        }
        //get row and column
        int row = matrix.length;
        int column = matrix[0].length;

        // first time to get the right row
        int startRow = 0;
        int endRow = row-1;

        while(startRow+1<endRow){
            int MiddleRow = (endRow-startRow)/2+startRow;
            if(matrix[MiddleRow][0]==target){
                return true;
            }else if(matrix[MiddleRow][0]<target){
                startRow = MiddleRow;
            }else{
                endRow =MiddleRow;
            }
        }

        if(matrix[endRow][0]<=target){
            row = endRow;
        }else if(matrix[startRow][0]<=target){
            row =startRow;
        }else {
            return false;
        }
        //second try to get right column postion in that row.
        int startCol = 0;
        int endCol =column-1;
        while(startCol+1<endCol){
            int middCol = startCol+(endCol-startCol)/2;
            if(matrix[row][middCol]==target){
                return true;
            }else if(matrix[row][middCol]<target){
                startCol = middCol;
            }else {
                endCol = middCol;
            }
        }
        if(matrix[row][startCol] == target){
            return  true;
        } else if(matrix[row][endCol]==target){
            return true;
        }

        return false;
    }

}
