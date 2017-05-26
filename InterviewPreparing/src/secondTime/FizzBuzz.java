package secondTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-04-20.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result =new ArrayList<String>();
        if(n<=0){
            return result;
        }
        int i= 1;
        while (i<=n){
            if(i%15==0){
                result.add("FizzBuzz");
            }else if(i%5==0){
                result.add("Buzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else {
                result.add(i+"");
            }
            i++;
        }
        return result;
    }
    public List<String> fizzBuzzWithOutReminder(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            //
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}
