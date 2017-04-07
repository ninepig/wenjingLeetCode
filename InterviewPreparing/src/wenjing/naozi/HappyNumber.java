package wenjing.naozi;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-03-07.
 */
public class HappyNumber {


    public boolean isHappy(int n) {

        if(n<=0){
            return false;
        }

        ArrayList<Integer> resultList = new  ArrayList<>();
        int result = n;
        while(result !=1){

            if(resultList.contains(result)){
                return false;
            }
            resultList.add(result);
            result = getSquareSum(result);
        }
        return true;

    }

    private int getSquareSum(int n) {
        // TODO Auto-generated method stub
        int sum = 0;
        int digit =0;
        while(n>0){
            digit = n%10;
            n=n/10;
            sum = digit*digit+sum;
        }

        return sum;
    }


}
