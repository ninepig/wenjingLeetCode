package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/10.
 */
public class longestSeqSubSeq {
    public int lengthOfLIS(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int[] lengthRes = new int[nums.length];

        for(int i = 0;i<lengthRes.length;i++){
            lengthRes[i] = 1;
        }
        for(int i = 1; i<lengthRes.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    //state transer , lengthRes[j] = Math.max(lengthRes[i],lengthRes[j]+1)
//                    if(lengthRes[j]+1>lengthRes[i]){
//                        lengthRes[i] = lengthRes[j]+1;
//                    }
                    lengthRes[i] = Math.max(lengthRes[i],lengthRes[j]+1);
                }
            }
        }
        int longest = 0;
        for(int i = 0;i<lengthRes.length;i++){
            longest = Math.max(longest,lengthRes[i]);
        }
        return longest;

    }
}
