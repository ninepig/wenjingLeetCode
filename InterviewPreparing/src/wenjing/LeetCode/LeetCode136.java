//package wenjing.LeetCode;
//
//import java.util.Enumeration;
//import java.util.Hashtable;
//
///*
// * Given an array of integers, every element appears twice except for one. Find that single one.
// *
// * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
// */
//public class LeetCode136 {
//
//	//�����ķ����������κ�����0���Ϊ�Ǹ�������������ͬ�������Ϊ0
//	public int singleNumber(int[] nums) {
//        if(nums==null||nums.length==0 )
//        {
//            return 0;
//        }
//        if(nums.length==1){
//            return nums[0];
//        }
//        int result =0;
//        for(int i = 0 ; i<nums.length;i++ ){
//           result = result^nums[i];
//        }
//        return result;
//    }
//	//�������ñ�ķ����������ϣ��
//
//	public int singleNumber(int[] nums) {
//
//	    Hashtable<Integer,Integer> table = new Hashtable();
//
//	    for(int i=0;i<nums.length;i++)
//	    {
//	        if(table.containsKey(nums[i]) == false)
//	        {
//	            table.put(nums[i],i);
//	        }
//	        else
//	        {
//	            table.remove(nums[i]);
//	        }
//	    }
//	    Enumeration<Integer> keys = table.keys();
//	    return keys.nextElement();
//}
