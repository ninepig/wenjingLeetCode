package wenjing.LeetCode;

/*
 * LeetCode 263 ugly number
又脑残了 取余的概念 搞错了啊。。哥哥。取余 是看是否能被 X整除啊！ 蠢
这道题 只要看 这个数能否被2 3 5 循环整除， 如果最后的结果是1 则说明是丑数 如果不是1 则说明有别的质数（7）

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
