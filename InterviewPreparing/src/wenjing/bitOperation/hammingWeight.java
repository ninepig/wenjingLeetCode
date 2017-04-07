package wenjing.bitOperation;

/**
 * Created by yamengwenjing on 2017-03-24.
 */
public class hammingWeight {
    //每次右移N位，然后和1 &
    public int hammingWeight(int n) {
        int counter = 0 ;
        int temp = 0;
        for(int i = 0; i<32;i++){

            temp = (n>>i)&1;
            if(temp == 1)
                counter++;


        }

        return counter;

    }

    public int hammingWeight2(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }


}
