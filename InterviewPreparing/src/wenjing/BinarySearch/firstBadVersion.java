package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-23.
 *又是一道二分法~又是那么简单
 */
public class firstBadVersion {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {

        if(n<=0){
            return -1;
        }
        int begin = 1;
        int end = n;

        while(begin+1<end){
            int middle = begin+(end-begin)/2;
            if(isBadVersion(middle)){
                end = middle;
            }else{
                begin = middle;
            }
        }
        if(isBadVersion(begin)){
            return begin;
        }
        return end;


    }
}
