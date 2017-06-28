package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/22.
 */
public class SearchA2dMatrixIP {
    public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix==null||matrix.length==0){
                return false;
            }
            if(matrix[0]==null||matrix[0].length==0){
                return false;
            }
            int row = matrix.length;
            int column = matrix[0].length;
            int start = 0 ;
            int end = row*column-1;

            while (start+1<end){
                int mid = start+(end-start)/2;
                if(matrix[mid/column][mid%column]==target){
                    return true;
                }else if (matrix[mid/column][mid%column]>target){
                    end = mid;
                }else {
                    start = mid;
                }
            }

            if(matrix[start/column][start%column] == target){
                return true;
            }else if(matrix[end/column][end%column] == target){
                return true;
            }else {
                return false;
            }

    }
}
