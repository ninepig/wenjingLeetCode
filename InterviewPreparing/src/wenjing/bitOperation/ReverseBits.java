package wenjing.bitOperation;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by yamengwenjing on 2017-04-13.
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0 ;
        for(int i=0;i<32;i++){

            result += n&1;
            //it is unisigned  so we need use unisign shift.
            n=n>>>1;
            // for last digit , we dont need shift.
            if(i<31){
                result = result<<1;
            }
        }
        return result;
    }

}
