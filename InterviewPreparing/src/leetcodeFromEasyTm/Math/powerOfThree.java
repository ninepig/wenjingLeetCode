package leetcodeFromEasyTm.Math;

/**
 * Created by yangw on 2017/9/6.
 */
public class powerOfThree {
    public boolean isPowerOfThree(int n) {
            if (n==0){
                return false;
            }
            while (n>0){
                if(n%3!=0){
                    break;
                }
                n = n/3;
            }
            return n==1;
    }

}
