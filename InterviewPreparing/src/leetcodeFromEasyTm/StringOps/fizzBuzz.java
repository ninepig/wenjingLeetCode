package leetcodeFromEasyTm.StringOps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/8/31.
 */
public class fizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0;i<n;i++)
            if(n%15==0){
                result.add(0,"FizzBuzz");
            }else if(n%3==0){
                result.add("Fizz");
            }else if(n%5==0){
                result.add("Buzz");
            }else {
                result.add(n+"");
            }

        return result;
    }
}
