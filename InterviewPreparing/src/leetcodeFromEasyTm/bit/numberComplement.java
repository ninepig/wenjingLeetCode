package leetcodeFromEasyTm.bit;

/**
 * Created by yangw on 2017/8/30.
 */
public class numberComplement {
    public int findComplement(int num) {

        int mask = Integer.highestOneBit(num)<<1 -1 ;

        num = ~num;

        return num & mask;

    }
}
