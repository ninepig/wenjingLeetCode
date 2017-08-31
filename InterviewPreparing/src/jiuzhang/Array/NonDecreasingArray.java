package jiuzhang.Array;

/**
 * Created by yangw on 2017/8/29.
 *2 Examples:
 0  ...  i ...
 1 1 3 4[2]5 6  - in this case we can just raise a[i] to 4;
 4
 1 1 2[4]3 3 4  - in this case lower a[i-1] is better;
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {

//        if(nums==null||nums.length==0){
//            return true;
//        }
//        int[] temp =new int[nums.length-1];
//
//
//        int skipPos = 0;
//
//        while (skipPos<nums.length) {
//            for (int i = 0; i < nums.length; i++) {
//                if (skipPos == i) {
//                    skipPos++;
//                    continue;
//                }
//                temp[i] = nums[i];
//            }
//            if(!judgeIfDecresing(temp)){
//                return false;
//            }
//        }
//        return true;
        int modified = 0 ;
        for(int i = 1; i < nums.length; i++){

            if(nums[i]<nums[i-1]){

                if (modified>0){
                return false;
                }
                modified++;
                if(i-2<0||nums[i-2]<=nums[i]){
                    nums[i-1] = nums[i];
                }else {
                    nums[i]=nums[i-1];
                }
            }

        }
        return true;

    }


}
