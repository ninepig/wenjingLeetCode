package wenjing.LeetCode;
/*
 * LeetCode 198 ����
�����Ŀ ��һ��ʼ�ķ�Ӧ���������򣬵������룬Ҫά��һ��index�ı�������ܸ��ӡ�
����tag����ʵ������Ŀ��Ӧ����DP,  ��Ϊ��������ͣ����Էֽ�Ϊ�����⡣ ����̫�٣�û�о��顣
״̬����Ҳ�ܺ�д ��ά��һ��ǰ�������ӵ��ܽ�������
N= 0 result = 0
N = 1  result = num[0]
N = 2 result = max��num[0],numer[1]��
N >= 2 result = max(result[i-2]+number[i],result[i-1])
�Ƿ�������һ�� ȡ���ڣ���Һ�ǰǰ�ҵĲƲ�֮����û�� ǰһ�ҵĴ�Ϳ�����

 */
public class LeetCode198 {
	  public int rob(int[] nums) {
			int length = nums.length;
	       	if(nums==null|| length<1){
		      		return 0;
		      	}
	      	int[] resultArray = new int[length];
	      	if(length == 1){
	      		return nums[0];
	      	}
	      	if(length == 2){
	      		return Math.max(nums[0], nums[1]);
	      	}
	      	resultArray[0] = nums[0];
	      	resultArray[1] = Math.max(nums[0], nums[1]);
	      	//ע�������Ͻ찡����
	        for(int i = 2 ;i<nums.length;i++){
	        	resultArray[i] = Math.max(resultArray[i-2]+nums[i],resultArray[i-1] );
	        }
	        return resultArray[length-1];
	    }
}
