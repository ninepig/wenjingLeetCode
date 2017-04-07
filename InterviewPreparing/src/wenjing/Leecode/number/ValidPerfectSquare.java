package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-03-28.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {

        if(num==1){
            return true;
        }

        long low =1,high=num/2,mid=0;
        long nums = (long)num;
        //要用小于等于，因为可能出现都是low 和 high 是同样值得情况 比如2*2 3*3
        while (low<=high){
            mid = low+(high-low)/2;
            if((mid*mid)==nums){
                return true;
            }else if((mid*mid)<nums){
                low = mid+1;
            }else {
                high =mid-1;
            }
        }

        return  false;
    }
}
