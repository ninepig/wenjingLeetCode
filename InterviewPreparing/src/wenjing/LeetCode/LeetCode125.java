package wenjing.LeetCode;

/*
 * 暴力法解决，
两边各维护一个指针。 全部变成小写，然后排除掉标点符号的情况，然后两边比较。
要考虑的特殊情况是 如果string 是NULL 或者 string的长度只有1 他返回的是true。 

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
