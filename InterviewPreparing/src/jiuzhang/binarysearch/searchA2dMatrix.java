package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/14.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 */
public class searchA2dMatrix {



    public boolean searchMatrixOnce(int[][] matrix, int target) {
        if(matrix == null|| matrix.length == 0){
            return false;
        }
        //对于matrix的问题 要多一次判断
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }


        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        // length of matrix
        int end = row*column-1;

        while (start+1<end){
            int mid = start + (end-start)/2;
            //get responding postion of mid
            int thisRow = mid/column;
            int thisColumn = mid%column;
            if(matrix[thisRow][thisColumn]==target){
                //不一定能走到这一步，比如[[1]]的情况，直接跳出循环了
                return  true;
            }else if (matrix[thisRow][thisColumn]>target){
                end = mid;
            }else {
                start = mid;
            }
        }
        // 这个模板只是让最终start 和 end 无限逼近 或者是相交，循环完了以后 一定要做判断，不要偷懒，自以为做对了
        if (matrix[start / column][start % column] == target) {
            return true;
        } else if (matrix[end / column][end % column] == target) {
            return true;
        }else {
            return false;
        }
    }

    public boolean searchMatrixTwice(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;

        // find the row index, the last number <= target
        int start = 0, end = row - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[end][0] <= target) {
            row = end;
        } else if (matrix[start][0] <= target) {
            row = start;
        } else {
            return false;
        }

        // find the column index, the number equal to target
        start = 0;
        end = column - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        }
        return false;
    }


}
