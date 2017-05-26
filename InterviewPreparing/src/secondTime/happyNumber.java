package secondTime;

import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-05-03.
 */
public class happyNumber {

    public boolean isHappy(int n) {

        if(n<=0){
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        int sum = n ;
        while (sum!=1){
          if(set.contains(sum)){
              return false;
          }
          set.add(sum);
          sum = getSum(sum);

        }
        return true;
    }

    private int getSum(int n) {
       int dight = 0;
        int sum = 0;
        while (n>0){
            dight = n%10;
            sum += dight*dight;
            n/=10;
        }
        return sum;
    }


}
