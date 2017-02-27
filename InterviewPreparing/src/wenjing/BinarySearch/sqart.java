package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-23.
 * 没想到这个题目也是一个二分法。
 * 注意小数问题
 */
public class sqart {
    public int mySqrt(int x) {

        if(x<0){
            return -1;
        }
    //这个题有可能有小数，所以要用long 来做
        long begin = 0;
        long end = x;
        while(begin+1<end){
            long middle = begin+(end-begin)/2;

            if(middle*middle<=x){
                begin =middle;
            }else{
                end = middle;
            }

        }
            if(end*end<=x){
                return (int)end;
            }
            return  (int)begin;


    }

}
