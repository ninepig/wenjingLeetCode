package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/13.
 * Given a sorted array of n integers, find the starting and ending position of a given target value.

 If the target is not found in the array, return [-1, -1].
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].
 */
public class seachForArange {
    public int[] searchRange(int[] A, int target) {
        // write your code here
        if(A.length==0||A==null){
            return new int[]{-1,-1};
        }
        int start = 0;
        int end = A.length-1;
        int mid ;
        int rangeBegin = -1;
        int rangeEnd = -1;
        while (start+1<end){
            mid = start+(end-start)/2;
            if(A[mid] == target){
                end = mid;
            }else if(A[mid]>target){
                end = mid;
            }else {
                start = mid;
            }
        }
        if(A[start] == target){
            rangeBegin = start;
        }else if(A[end] == target){
            rangeBegin = end;
        }
         start = 0;
         end = A.length-1;
        while (start+1<end){
            mid = start+(end-start)/2;
            if(A[mid] == target){
                start = mid;
            }else if(A[mid]>target){
                end = mid;
            }else {
                start = mid;
            }
        }
        if(A[end] == target){
            rangeEnd = end;
        }else if(A[start] == target){
            rangeEnd = start;
        }

        return new int[]{rangeBegin,rangeEnd};
    }
}
