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
        //��ȡ���鳤��  
        int size=nums.length;  
        /** 
         * ���K>size�������Ч���ȣ��������ΪK<size,������leetcode��OJ���Ե�ʱ�� 
         * ��������ֹ��ɣ���ʵ�����������е�Ч���ȴ��롣 
         */  
        if (k>size)  
        {  
            k=k%size;  
        }  
        //��ת��Kλ����������Kλ��֮ǰ����  
        reversal(nums,0,size-k-1);  
        //��ת��kλ��������Kλ��֮�����  
        reversal(nums,size-k,size-1);  
        //��ת��������  
        reversal(nums,0,size-1);  
    }  
      
    public static void reversal(int[] nums,int i,int j)  
    {  
        //�����м�洢����  
        int temp=0;  
        //�������м����ν��л�λ  
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
