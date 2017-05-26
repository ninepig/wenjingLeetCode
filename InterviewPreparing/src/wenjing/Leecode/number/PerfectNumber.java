package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-04-07.
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            // 1 does not satified the requirement
            return false;
        }
        int sum = 0;
        for(int i = 2; i<= Math.sqrt(num);i++){
            if(num%i==0){
                sum += i+num/i;
            }
        }
        sum+=1;
        return sum==num;
    }

}
