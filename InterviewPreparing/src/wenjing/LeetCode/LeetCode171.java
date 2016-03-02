package wenjing.LeetCode;

/*
 * easy
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */


/*2016/2/29 9:18
 * ����˼·��
 * ��nλ�������26�ģ�N-1���η����Ե�Nλ��ֵ ����ÿһλ�ĺ���Ӽ��ɡ�A����1--Z����26
 * ��������ĸ�����Ϊϵ����eg��C-A +1 = 3
 *
 *���ܣ�
 *�����⣬һ��Ҫ��������⣬��òݸ壬�Ϳ���һ������
 */
public class LeetCode171 {

	public int  titleToNumber(String s){
		
		char[] intputTitleArray = s.toCharArray();
		int number = 0;
		for(char thisChar:intputTitleArray){
			//��Ϊ��һλ��ϵ������Ҫ���ǵ��߼����һλ��ϵ����0+char�������ϵ��,�õ�ϵ���Ϳ��Լ�����һλ��ֵ�ˡ�bingo
			number = number*26 +(thisChar-'A'+1); 
		}
		
		return number;
		
	}
	
	
}
