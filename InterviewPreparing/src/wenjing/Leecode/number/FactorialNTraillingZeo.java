package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2016-11-16.
 */
public class FactorialNTraillingZeo {

    public int trailingZeroes(int n) {

        if(n<=0){
            return 0;
        }
        int count=0;
        while (n>0){
            count = count + n/5;
            n = n/5;
        }
        return count ;
    }

}
