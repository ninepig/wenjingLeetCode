package leetcodeFromEasyTm.Math;

/**
 * Created by yangw on 2017/9/6.
 */
public class uglyNumber {
    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        int temp = num;
        while(temp%5==0){
            temp = temp/5;
        }
        while(temp%3==0){
            temp = temp/3;
        }
        while(temp%2==0){
            temp = temp/2;
        }
        return temp==1;

    }

}
