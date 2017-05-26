package secondTime;

/**
 * Created by yamengwenjing on 2017-04-25.
 */
public class sumOfInteger {
    public int getSum(int a, int b) {
        if(b==0){
            return a;
        }
        //相互或 可以得到相加留下的数（不算进位）
        int sum  = a ^ b;
        int carry = (a&b) << 1;
        return getSum(sum,carry);


    }
}
