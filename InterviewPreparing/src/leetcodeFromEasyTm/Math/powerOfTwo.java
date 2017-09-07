package leetcodeFromEasyTm.Math;

/**
 * Created by yangw on 2017/9/6.
 */
public class powerOfTwo {
    public boolean isPowerOfThree(int n) {
        if (n==0){
            return false;
        }
        while (n>0){
            if(n%2!=0){
                break;
            }
            n = n/2;
        }
        return n==1;

        // return !n&&(n-1);
    }
}
