package secondTime;

/**
 * Created by yamengwenjing on 2017-05-04.
 */
public class seachInsertPostion {

    public int searchInsert(int[] nums, int target) {

        if(nums==null|nums.length==0){
            return 0;
        }

        int l =0;
        int r = nums.length-1;

        while (l+1<r){
            int middle = l+(r-l)/2;

            if(nums[middle]==target){
                return middle;
            }else if (nums[middle]>target){
                r = middle-1;
            }else {
                l = middle + 1;
            }
        }
        return l;

    }

}
