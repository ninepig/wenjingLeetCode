package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-03-07.
 */
public class powerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        //如果是3的倍数，则不断地除3，最终如果得出结果是1 ，则可以是3的power
        while(n%3==0){
            n = n/3;
        }
        if (n==1){
            return true;
        }
        return false;
    }

}
