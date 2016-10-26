package wenjing.LeetCode;

/*
 * LeetCode 263 ugly number
���Բ��� ȡ��ĸ��� ����˰�������硣ȡ�� �ǿ��Ƿ��ܱ� X�������� ��
����� ֻҪ�� ������ܷ�2 3 5 ѭ�������� ������Ľ����1 ��˵���ǳ��� �������1 ��˵���б��������7��

 */
public class LeetCode263 {
	public boolean isUgly(int num) {
		if(num<0){
			return false;
		}
		while(num %2 == 0)
			num /=2;
		while(num %3 == 0)
			num /=3;
		while(num %5 == 0)
			num /=5;
		
		return num == 1;
	}
}
