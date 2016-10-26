package wenjing.LeetCode;

public class LeetCode189 {
//	 public void rotate(int[] nums, int k) {
	        
//		 int[] temp = new int[k];
//		 int length = nums.length-1;
//		 for(int i = k-1,j=0;i>=0;i--){
//			 temp[j]=nums[length-i];
//			 j++;
//		 }
//		 for(int i=0;i<length-1-k;i++){
//			 nums[i+k] = nums[i];
//		 }
//		
//		 for(int i=0;i<k;i++){
//			 nums[i] = temp[i];
//		 }
		  
//	    }
	
	void reverse(int[] nums, int start, int end) {  
        while(start < end) {  
            int temp = nums[start];  
            nums[start] = nums[end];  
            nums[end] = temp;  
            ++start;  
            --end;  
        }  
    }  
    public void rotate2(int[] nums, int k) {  
        k = k % nums.length;  
        reverse(nums, 0, nums.length - 1 );  
        reverse(nums, 0, k - 1 );  
        reverse(nums, k, nums.length - 1 );  
    }  
	
    
    
    public static void rotate(int[]nums,int k)  
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
}
