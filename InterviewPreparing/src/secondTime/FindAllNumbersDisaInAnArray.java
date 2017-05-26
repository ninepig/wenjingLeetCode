package secondTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-04-24.
 */
public class FindAllNumbersDisaInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums==null||nums.length==0){
            return new ArrayList<Integer>();
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i<nums.length;i++){
            // 他原来的位置会有值，+N 可以作为一个判断
            nums[(nums[i]-1)%nums.length] += n;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<=n){
                //如果原来的位置没有值 则表明他是空的！
                result.add(j+1);
            }
        }

        return result;
    }
}
