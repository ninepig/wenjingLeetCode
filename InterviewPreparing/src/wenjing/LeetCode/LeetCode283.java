//package wenjing.LeetCode;
///*
// * leetcode 283
//
//�ƶ����е�0 ����� �������İ���˳�򲻱�
//�����ж��������ռ䣬������һ�����飬Ҫ��o(n)��
//
//һ��ʼ����һ������Ķ��У��������� ����Ҫ����Ŀռ䣬�϶����С�
//���˴�����˼·
//ɨ��һ�����飬�ѷ�0�İ���˳��ŵ�����ǰ�ˣ�Ȼ�󱣴�һ��pos��λ��
//Ȼ��pos֮�����������Ϊ0
//
// */
//public class LeetCode283 {
//    public void moveZeroes(int[] nums) {
//        if(nums==null){
//            return;
//        }
//        int pos = 0;
//        for(int i = 0;i<nums.length;i++){
//            if(nums[i]!=0){
//                nums[pos] = nums[i];
//                pos++;
//            }
//        }
//        for(int i = pos;i<nums.length;i++){
//            nums[pos] = 0;
//            pos++;
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    public void moveZeroes(int[] nums) {
//        if(nums==null){
//            return;
//        }
//        int pos = 0;
//        int zeroNum = 0;
//        for(int i = 0 ; i <= nums.length-1;i++){
//        	if(nums[i] != 0){
//        		nums[pos] = nums[i];
//        		pos++;
//        	}else{
//        		zeroNum++;
//        	}
//        }
//        for(int j = pos+1;j<=nums.length-1;j++){
//        	nums[j] = 0;
//        }
//
//    }
//
//
//}
