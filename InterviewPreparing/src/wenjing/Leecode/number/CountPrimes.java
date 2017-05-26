package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-04-17.
 * 找出少于N的所有prime的数量。
 *
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] countArray = new boolean[n];
        int count = 0;
        for(int i = 2; i<n;i++){
            if(countArray[i]==false){
                count++;
                // if this number is a prime, then we can tell [i*j] not a prime.
                for(int j = 2;i*j<n;j++){
                    countArray[i*j] = true;
                }
            }
        }
        return count;

    }
}
