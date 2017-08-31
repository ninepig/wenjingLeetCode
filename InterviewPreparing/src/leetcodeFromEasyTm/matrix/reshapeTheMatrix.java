package leetcodeFromEasyTm.matrix;

/**
 * Created by yangw on 2017/8/31.
 */
public class reshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {


        if(nums==null||nums.length==0){
            return nums;
        }
        // if shape dont match . return nums;
        if(nums.length*nums[0].length != r*c){
            return nums;
        }

        int[][] result = new int[r][c];
        int[] temp = new int[r*c];
        int index = 0;
        // put orinnal into temp
        for(int i = 0 ; i<nums.length ; i++){
            for (int j = 0 ; j<nums[0].length;j++){
                temp[index] = nums[i][j];
                index++;
            }
        }
        int newIndex = 0;
        for (int i=0;i<r;i++){
            for (int j = 0; j<c; j++){
                result[i][j] = temp[newIndex];
                newIndex++;
            }
        }
        return result;


    }
}
