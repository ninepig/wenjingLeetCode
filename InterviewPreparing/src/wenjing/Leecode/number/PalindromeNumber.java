package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2016-11-20.
 *   /*
 算和是有技巧的，先要result  然后用
 result = result*10
 result = x%10; 这样才是正确的写法
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x<10&&x>0)
            return true;
        int result = 0 ;
//        int digit = 0;

        while(x>0){
           //result 要拿之前的digit先加，所以才会出错，不对 再想想
            result = result * 10;
            result = x%10;
            x=x/10;
        }
        return result==x;
    }
    /*
    算和是有技巧的，先要result  然后用
    result = result*10
    result = x%10; 这样才是正确的写法
     */

//    int result = 0 , thisNumber = x;
//		  while(thisNumber>0){
//
//        result *= 10;
//        result += thisNumber%10;
//        thisNumber /= 10;
//
//    }
//
//		  return result == x;

}
