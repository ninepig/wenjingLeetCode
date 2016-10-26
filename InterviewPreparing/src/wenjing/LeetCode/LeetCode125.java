package wenjing.LeetCode;

/*
 * �����������
���߸�ά��һ��ָ�롣 ȫ�����Сд��Ȼ���ų��������ŵ������Ȼ�����߱Ƚϡ�
Ҫ���ǵ���������� ���string ��NULL ���� string�ĳ���ֻ��1 �����ص���true�� 

 */
public class LeetCode125 {

	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}

		int left = 0;
		int right = s.length()-1;
		// upcase and lowcase difference in Integer;
		s = s.toLowerCase();

		while (left < right) {
			while (left < right && !isNumberOrAlpha(s.charAt(left))) {
				left++;
			}
			while (left < right && !isNumberOrAlpha(s.charAt(right))) {
				right--;
			}

			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}

		return true;

	}

	private boolean isNumberOrAlpha(char charAt) {
		// TODO Auto-generated method stub
		return	(charAt>='0' && charAt<='9')|| (charAt>='a'&&charAt<='z')||(charAt>='A'&&charAt<='Z') ;
	}
	
	
}
