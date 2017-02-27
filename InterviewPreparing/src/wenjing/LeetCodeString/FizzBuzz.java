package wenjing.LeetCodeString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-02-17.
 */
/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 比较简单的一个题，只要先考虑15的情况，在考虑3 和 5的即可。
 把最特别的先拿出来即可。

 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();

        for(int i=1;i<=n;i++){
            if(i%15==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(n+"");
            }
        }
        return result;

    }


}
