package secondTime;

/**
 * Created by Administrator on 2017/5/10.
 */
public class NumberOfOneBits {

    public int hammingWeight(int n) {
        int result = 0;

        for(int i = 0;i<=31;i++){
         if(((n>>i)&1)==1){
             result+=1;
            }
        }
        return result;
    }

}
