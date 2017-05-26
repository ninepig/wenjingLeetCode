package secondTime;

/**
 * Created by yamengwenjing on 2017-04-20.
 */
public class NumberComplement {
    public int findComplement(int num) {
        int help = Integer.highestOneBit(num)<<1-1;
        num = ~ num;
        return help&num;
    }
}
