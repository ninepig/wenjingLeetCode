package wenjing.LeetCode;

/*
 * LeetCode 67 addBinary
�õ�����⣬��һ��Ӧ����ά����λ��ά����λ�������ľ�����һ����Ŀ���������
��ǰλ��ֵΪȡ�࣬��λ��ֵΪ����X, ����ж�carryλ�Ƿ�Ϊ1�����Ϊ1����Ҫ�ڽ��ͷ�����һ��1
�������Լ��ķ���̫�����ˣ��������true��Ȼ�������ַ����������ܴ���
���˴� �����ȴ𰸲��ÿ���ת��int��ֱ����char - ��0�� ����ȡ�������intֵ
���������StringBuilder������Ч�ʸߣ����ҷǳ���㡣�����𰸵������ǳ��ǳ����ɣ��õ���forѭ�� ���Լ��𰸡���������ŵĴ���
�����ѭ����ʱ�򣬱�����2���ж�������For�� �Ͳ�Ҫ��i-- j--д��for��ʼ���ֱ����������д ������

 */
public class LeetCode67 {
	public String addBinary(String a, String b) {
		if(a == null || b == null){
			return null;
		}
		
		int carry  =  0;
		StringBuilder sb = new StringBuilder();
		for(int i = a.length()-1,j = b.length()-1;i>=0||j>=0;){
			if(i>=0){
				carry = a.charAt(i)-'0'+carry;
				i--;
			}
			if(j>=0){
				carry = b.charAt(j)-'0'+carry;
				j--;
			}
			int currentDigit = carry%2;
			carry = carry/2;
			sb.insert(0, ""+currentDigit);
		}
		
		if(carry==1){
			sb.insert(0, "1");
		}
		
		return sb.toString();

	}
	
//	   public String addBinary2(String a, String b) {
//	        int c = 0;
//	        StringBuilder sb = new StringBuilder();
//	        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;){
//	            if(i >= 0) c += a.charAt(i--) - '0';
//	            if(j >= 0) c += b.charAt(j--) - '0';
//	            sb.insert(0, (char)((c % 2) + '0'));
//	            c /= 2;
//	        }
//	        if(c == 1) sb.insert(0, "1");
//	        return sb.toString();
//	    }
}
