package wenjing.LeetCode;

public class LeetCode191 {
	 // you need to treat n as an unsigned value
	
	//�Լ���һ��������ˣ� �����㷨�����Լ�������ģ�������iӦ����32 ����31�� ��Ϊ���Ǵ��ƶ�0λ��ʼ�������Ҫ�ƶ�31λ������Ӧ����I<=31 OR I <32
    public int hammingWeight(int n) {
        int counter = 0 ;
        int temp = 0;
        for(int i = 0; i<32;i++){
        	
        	temp = (n>>i)&1;
        	if(temp == 1)
        		counter++;
        	
        	
        }
        
        return counter;
        
    }
}
