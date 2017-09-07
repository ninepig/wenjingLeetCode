package leetcodeFromEasyTm.bit;

/**
 * Created by yangw on 2017/9/7.
 */
public class powerOF4 {
    public boolean isPowerOfFour(int num) {
        return (num-1)>=0&&(num&(num-1))==0&&(num-1)%3==0;
    }
}
