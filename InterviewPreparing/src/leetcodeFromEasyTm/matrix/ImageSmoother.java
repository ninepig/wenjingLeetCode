package leetcodeFromEasyTm.matrix;

/**
 * Created by yangw on 2017/9/2.
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
         int[][] result = new int[M.length][M[0].length];
         int sum = 0;
         int count = 0;
         for (int i = 0; i< M.length; i++){
             for (int j = 0 ; j< M[0].length;j++){
                 sum =M[i][j];
                 count = 1;
                 if (i-1>=0){
                     sum+=M[i-1][j];
                     count++;
                        if(j-1>=0){
                            sum+=M[i-1][j-1];
                            count++;
                            //不能考虑这两个
//                            sum+=M[i][j-1];
//                            count++;
                        }
                        if (j+1<M[0].length){
                            sum+=M[i-1][j+1];
                            count++;
//                            sum+=M[i][j+1];
//                            count++;
                        }
                 }

                 if(j-1>=0){
                     sum+=M[i][j-1];
                    count++;
                 }
                 if(j+1<M[0].length){
                     sum+=M[i][j+1];
                    count++;
                 }


                 if(i+1<M.length){
                     sum+=M[i+1][j];
                     count++;
                     if(j-1>=0){
                         sum+=M[i+1][j-1];
                         count++;
                     }
                     if(j+1<M[0].length){
                         sum += M[i+1][j+1];
                         count++;
                     }
                 }
                 result[i][j] =(int) Math.floor(sum/count);

             }
         }

         return result;

    }
}
