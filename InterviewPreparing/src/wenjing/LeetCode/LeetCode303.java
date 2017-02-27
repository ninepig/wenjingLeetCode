package wenjing.LeetCode;

/*
 * LeetCode 303 range Sum query
һ��ʼ���ñ����������ˡ������ǿ������˵Ĵ𰸡�����֪���Լ��ж����档
ά��һ��sum����ѽ������������Ȼ�� i j ���൱��sumrage  sum��j�� �� sum��i �� 1�� �ľ��Ǵ��� ���i = 0 sum��j��

 */
public class LeetCode303 {
	int[] sums;
	
//    public NumArray(int[] nums) {
//    	//���޸�������  ��ֱ��retrun����ͨ���ˣ�����½����飬��ͨ������֡���
//        if(nums == null || nums.length==0 ){
//
//           return;
//        }
//    	int length = nums.length;
//    	sums = new int[length];
//    	sums[0] = nums[0];
//    	for(int i = 1; i<length;i++){
//    		sums[i] = sums[i-1]+nums[i];
//    	}
//
//    }

    
    public int sumRange(int i, int j) {
        
    	return i==0 ? sums[j] : sums[j]-sums[i-1]; 
    	
    	
    }
	
	
}
