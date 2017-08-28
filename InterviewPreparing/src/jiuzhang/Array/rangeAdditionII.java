package jiuzhang.Array;

/**
 * Created by yangw on 2017/8/27.
 */
public class rangeAdditionII {
    //方法是对的，但是内存报错。
    public int maxCountMemery(int m, int n, int[][] ops) {

        int[][] matrix = new int[m][n];

        int result = 0;
        int biggest = 0;

        //do ops
        for(int i = 0; i<ops.length;i++){
            int a = ops[i][0];
            int b = ops[i][1];
            for(int j = 0;j<a;j++){
                for (int k = 0;k<b;k++){
                    matrix[j][k]++;
                }
            }
        }
        //count
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j]>biggest){
                    biggest = matrix[i][j];
                    result = 0;
                }
                if(matrix[i][j] == biggest){
                    result++;
                }
            }
        }

        return result;

    }

    public int maxCount(int m, int n, int[][] ops){
        if (ops == null||ops.length==0){
            return m*n;
        }
        int minRow =Integer.MAX_VALUE;
        int minCol =Integer.MAX_VALUE;

        for (int[] op : ops){
            minRow = Math.min(minRow,op[0]);
            minCol = Math.min(minCol,op[0]);
        }
        return minCol*minCol;
    }
}
