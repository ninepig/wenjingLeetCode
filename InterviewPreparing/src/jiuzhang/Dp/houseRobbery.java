package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/10.
 */
public class houseRobbery {
    //normal dp
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
           return Math.max(nums[0],nums[1]);
        }
        int[] f = new int[nums.length];
        f[0]=nums[0];
        f[1]= Math.max(nums[0],nums[1]);

        for(int i = 2;i< nums.length;i++){

            f[i] = Math.max(nums[i]+f[i-2],f[i-1]);
        }
        return f[nums.length-1];
    }

    //local and global
    /*
    Include this house:
    i = num[k] + e (money of this house + money robbed excluding the previous house)

    Exclude this house:
    e = max(i, e) (max of money robbed including the previous house or money robbed excluding the previous house)
    (note that i and e of the previous step, that's why we use tmp here to store the previous i when calculating e, to make O(1) space)
     */
    public int rob2(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int i = 0;
        int e = 0;
        for (int k = 0; k<nums.length; k++) {
            int tmp = i;
            i = nums[k] + e;
            e = Math.max(tmp, e);
        }
        return Math.max(i,e);

    }
}
