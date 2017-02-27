package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-22.
 * https://adambillylee.gitbooks.io/lintcode/content/chapter2.3.html
 * http://xuyiruan.com/2016/06/28/Search-in-a-Big-Sorted-Array/
 *
 */
public class searchBigSortedArray {
    public int sortedArray(ArrayReader reader , int target){
        if(reader == null){
            return -1;
        }
        int low =0;
        int high = 0;
        int end = 0;
        while(reader.get(end)!=-1&& reader.get(end)<target){
            //+1 为了避免0的情况
            end  = end*2+1;
        }
        while(low+1<high){
            //因为升序我们要找第一个出现的，所以end =middle，如果是最后一个出现的 就是begin =middle
            int middle = low +(high-low)/2;
            if(reader.get(middle)==target) {
                end = middle;
            }else if(reader.get(middle)>target){
                low=middle;
            }else{
                end = middle;
            }
        }


        if(target == reader.get(low)){
            return low;
        }else if (target==reader.get(high)){
            return  high;
        }
        return -1;
    }

    private class ArrayReader {

        public int get(int end) {
            return 0;
        }
    }
}
