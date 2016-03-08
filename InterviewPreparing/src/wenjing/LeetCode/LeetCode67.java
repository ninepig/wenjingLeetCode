package wenjing.LeetCode;

/*
 * LeetCode 67 addBinary
拿到这个题，第一反应就是维护进位，维护进位想起来的就是上一道题目大神的做法
当前位的值为取余，进位的值为除以X, 最后判断carry位是否为1，如果为1，则还要在结果头上添加一个1
但是我自己的方法太复杂了，想的是用true，然后用用字符串来做，很蠢。
看了答案 ，首先答案不用考虑转成int，直接用char - ‘0’ 来获取所代表的int值
其次他用了StringBuilder，这样效率高，而且非常简便。整个答案的做法非常非常精巧，用的是for循环 可以见答案。这才是优雅的代码
多变量循环的时候，比如有2个判断条件的For， 就不要把i-- j--写在for初始化里，直接在条件里写 见代码

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
