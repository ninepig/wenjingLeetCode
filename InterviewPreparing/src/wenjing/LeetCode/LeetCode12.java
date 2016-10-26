package wenjing.LeetCode;

/*
 * 但是要牢记 几个特性，不能跨位相减，不能重复4次，左减数只有一位
把所有情况都打出来，每次选择能表示的最大值，把对应的字符串连起来（贪心）
因为除了个别情况，其他的情况全部是在右侧相加，比如9 只能最左边是IX 4 最左边一定是iv 90最左边一定是xc 以此类推
1 I 4IV 5V 9 IX 10 X 40 XL 50 L 90 XC  100 C 400 CD 500 D 900 CM 1000 M


 */
public class LeetCode12 {
	public String intToRoman(int num){
		if(num>=1000)return "M"+intToRoman(num-1000);
		if(num>=900) return "CM"+intToRoman(num - 900);
		if(num>=500)return "D"+intToRoman(num-500);
		if(num>=400) return "CD"+intToRoman(num - 400);
		if(num>=100)return "C"+intToRoman(num-100);
		if(num>=90) return "XC"+intToRoman(num - 90);
		if(num>=50)return "L"+intToRoman(num-50);
		if(num>=40) return "XL"+intToRoman(num - 40);
		if(num>=10)return "X"+intToRoman(num-10);
		if(num>=9) return "IX"+intToRoman(num - 9);
		if(num>=5)return "V"+intToRoman(num-5);
		if(num>=4) return "IV"+intToRoman(num - 4);
		if(num>=1) return "I"+intToRoman(num - 1);
		
		return "";
	}
	
	public String intToRomanNoRur(int num){
		if(num<0){
			return "" ;
		}
		String result = "";
		String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i = 0 ; num != 0 ;i++){
			while(num>values[i]){
				
				num -= values[i];
				result += symbols[i];
			}

			
		}

		return result;
		
	}
	
}
