package wenjing.LeetCode;

/*
 * roman to interger �Ƚϼ�
 * 
 * ��Ϥ���� 
 *I V X l C D M
 *ֻ�� I X C ������Ϊ��ߵļ���
 *���ܿ�λ����� ��I �ұ�ֻ�� vb X�ұ�ֻ�� lc C�ұ�ֻ��DM
 *���������ұ���� 
 */
public class LeetCode13Roman {

	 public int romanToInt(String s) {
	     if(s==null||s.length()<=0){
	    	 return 0;
	     }
		 
		 int result = 0;
	     
		 for(int i = 0; i<s.length();i++){
			 
			 switch(s.charAt(i)){
			 case 'I':
				 // I �������һλ ��I����һλ�� v ���� x
				 if(i<s.length()-1 && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
					 result = result - 1;
				 }else{
					 result = result + 1;
				 }
				 break;
			 case 'V':
				 result += 5;
				 break;
			 case 'X':
				 if(i<s.length()-1 && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
					 result = result -10;
				 }else{
					 result = result+ 10;
				 }
				 break;
			 case 'L':
				 result += 50;
				 break;
			 case 'C':
				 if(i<s.length()-1 && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
					 result = result - 100;
				 }else{
					 result = result +100;
				 }
				 break;
			 case 'D':
				 result +=500;
				 break;
			 case 'M':
				 result +=1000;
				 break;
				 //�Ƿ���
			 default :
				 return 0;
			 }
			
		 }

	      return result;
	 }
	
	
}
