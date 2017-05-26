package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-04-14.
 */
public class Sqrt {
    public int mySqrt(int x) {
        if(x<0){
            return -1;
        }
        long begin = 1;
        long end = x;
        while (begin+1<end){
            long middle = begin +(end-begin)/2;
            if(middle*middle<=x){
                begin =middle;
            }else {
                end = middle;
            }
        }
        if(end*end<=x){
            return (int) end;
        }
        return (int)begin;

    }
}
