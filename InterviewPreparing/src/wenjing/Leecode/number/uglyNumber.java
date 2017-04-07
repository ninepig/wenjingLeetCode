package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-03-25.
 */
public class uglyNumber {

    public boolean isUgly(int num) {

        if(num<=0){
            return false;
        }
        while (num%2==0) num= num/2;
        while(num%3 == 0) num = num/3;
        while(num%5 == 0) num = num/5;
        
        return num == 1;

    }


}
