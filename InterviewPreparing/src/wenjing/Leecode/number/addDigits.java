package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-02-21.
 *Total Accepted: 149793
 Total Submissions: 297240
 Difficulty: Easy
 Contributors: Admin
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?
 */

public class addDigits {

    /*
    枚举法，从1---写到19，然后找规律
     */
    public int addDigitsOone(int num) {
            if(num==0){
                return 0;
            }
            return (num-1)%9+1;
    }
    public int addDigits(int num) {

        // 从0--9 是一种情况 ，大于10的时候是另一种情况。要考虑多位数的情况
        if(num<=10){
            return  num;
        }
        int result= 0;
        while(num>=10) {
            result=0;
            while (num != 0) {
                result = result + num % 10;
                num = num / 10;
            }
            num =result;
        }
        return  result;
    }
}
