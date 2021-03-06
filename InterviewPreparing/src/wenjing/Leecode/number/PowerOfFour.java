package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2016-11-15.
 */
public class PowerOfFour {
    // to a number how to judge it is power of 4
    //0001
    //0100
    //00010000
    //01000000
    //just have one bit is 1,
    //number bigger than 0
    //number -1 can be mod by 3
    //number -1 余3 为0 是为了防止是2的power出现的情况。 比如说0010也可以只有一个0
    public boolean isPowerOfFour(int num) {
        return num>0&&((num-1)&num) == 0 &&(num-1)%3==0;
    }
}
