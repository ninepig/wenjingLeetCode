package jiuzhang.Array;

/**
 * Created by yangw on 2017/8/27.
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
            if(M == null||M.length==0){
                return M;
            }
            int[][] res= new int[M.length][M[0].length];
            int sum = 0 ;
            int count = 0;
            for(int i = 0 ; i < M.length; i++){

                for(int j = 0 ; j < M[0].length; j++){
                    sum = M[i][j];
                    count = 1;

                    if(i-1>=0){
                        sum += M[i-1][j];
                        count++;
                        if(j-1>=0){
                            sum+=M[i-1][j-1];
                            count++;
                        }
                        if(j+1<M[0].length){
                            sum+=M[i-1][j+1];
                            count++;
                        }
                    }

                    if(j-1>=0){
                        sum+=M[i][j-1];
                        count++;
                        if (i+1<M.length){
                            sum+=M[i+1][j-1];
                            count++;
                        }
                    }

                    if(j+1<M[0].length){
                        sum +=M[i][j+1];
                        count++;
                    }

                    if(i+1< M.length){
                        sum+=M[i+1][j];
                        count++;
                        if (j+1<M[0].length){
                            sum+=M[i+1][j+1];
                            count++;
                        }
                    }
                    res[i][j] = (int)Math.floor(sum/count);
                }

            }
            return res;

    }
}
