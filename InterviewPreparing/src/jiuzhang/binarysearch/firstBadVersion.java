package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/14.
 */
public class firstBadVersion {
    /*
    就是一个二分法调用，但是没有大于 小于，就只有等于
     */
    boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n) {
        if(n<=0){
            return -1;
        }
        int start = 1;
        int end = n;
        while (start+1<end){
            int mid = start+(end-start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }else {
                start=mid;
            }
        }
        if(isBadVersion(start)){
            return start;
        }else if(isBadVersion(end)){
            return end;
        }else {
            return -1;
        }

    }
}
