package jiuzhang.binarysearch.practise;

/**
 * Created by yangw on 2017/6/22.
 */
public class searchForRangeP {
    public int[] searchRange(int[] A, int target) {
        // write your code here
        //两个二分法 一个找到 first 一个找到 last ， 2*logn
        if(A==null&&A.length==0){
            return new int[]{-1,-1};
        }

        int first=-1,last=-1;
        int start = 0, end = A.length-1;

        //get the first showing of target
        while (start+1<end){
            int mid = start+(end-start)/2;
            if(A[mid]==target){
                end = mid ;
            }else if(A[mid]>target){
                end =mid;
            }else {
                start = mid;
            }
        }
        if(A[start]==target){
            first = start;
        }else if(A[end] == target ) {
            first = end ;
        }

        start = 0;
        end = A.length-1;

        //get the first showing of target
        while (start+1<end){
            int mid = start+(end-start)/2;
            if(A[mid]==target){
                start = mid ;
            }else if(A[mid]>target){
                end =mid;
            }else {
                start = mid;
            }
        }
        if(A[end]==target){
            last = end;
        }else if(A[end] == target ) {
            last = start ;
        }

        return new int[]{first,last};

    }
}
