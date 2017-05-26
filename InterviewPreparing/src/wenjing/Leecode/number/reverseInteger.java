package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-04-18.
 */
public class reverseInteger {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        int number = Math.abs(x);
        int result = 0;

        while (number>0){

            if(result*10+number%10>Integer.MAX_VALUE){
                return 0;
            }

            int remider = number%10;
            result = result*10+remider;
            number = number/10;
        }

        return x>0?result:-result;
    }

}
