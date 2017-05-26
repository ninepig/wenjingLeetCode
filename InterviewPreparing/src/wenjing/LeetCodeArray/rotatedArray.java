package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2017-04-19.
 */
public class rotatedArray {
    /**
     * 12345678
     * k=3
     * 32187654
     * 45678321
     * @param nums
     * @param k
     */
    public  void rotate(int[]nums,int k)
    {
        //获取数组长度
        int size=nums.length;
        /**
         * 如果K>size，求其等效长度，起初会认为K<size,但是在leetcode的OJ测试的时候
         * 会出现这种规律，如实加了下面这行等效长度代码。
         */
        if (k>size)
        {
            k=k%size;
        }
        //翻转第K位（不包括第K位）之前的数
        reversal(nums,0,size-k-1);
        //翻转第k位（包括第K位）之后的数
        reversal(nums,size-k,size-1);
        //翻转整个数组
        reversal(nums,0,size-1);
    }

    public static void reversal(int[] nums,int i,int j)
    {
        //设置中间存储变量
        int temp=0;
        //两端往中间依次进行换位
        while (i<j&&i>=0)
        {
            temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
    }


    public  void rotateNomral(int[]nums,int k){

        if(k==0||nums==null){
            return;
        }
        int[] temp = new int[nums.length];

        k = k% nums.length;

        for(int i = 0;i<k;i++){
            temp[i]= nums[nums.length-k+i];
        }

        for(int i = nums.length-1-k;i>=0;i--){
            nums[i+k]= nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }


    }



}



