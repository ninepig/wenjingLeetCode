package wenjing.LeetCode;
/*
 * leetcode299
bulls and cows
�����Ŀ
һҪ��������λ�� ��Ҫ���������ظ���
�����bull�Ļ� ֻҪ��λ�ú����ֵĴ�С���ȽϾͿ�����
����cow�Ļ��ͱȽ��鷳����Ϊ�������ظ�
һ��ʼû����������˴𰸺�����Ҫ�������ظ����ֶ��ٴεľ���ά��һ��integer������ͺ��ˣ�����Ϊindex�����ִ�����Ϊvalue��֮ǰ�������� û������#���⼼�ɣ�
ֻҪ����һ��������֪���ظ���cows�ж���ֻ�ˣ�Ȼ����������һ������
��math.min�Ƚ����������ֵ��

 */
public class LeetCode299 {

	  public String getHint(String secret, String guess) {
	      
		  int[] secretInt = new int[10];
		  int[] guseeInt = new int[10];
		  int bullNumber = 0;
		  int cowNumber = 0;
		  for(int i = 0;i< secret.length();i++){
			  if(secret.charAt(i) == guess.charAt(i)){
				  bullNumber++;
			  }
			  else{
				  secretInt[secret.charAt(i)-'0']++;
				  guseeInt[guess.charAt(i)-'0']++;
			  }
		  }
		  for(int i = 0;i<10;i++){
			  cowNumber += Math.min(secretInt[i], guseeInt[i]);
		  }
	        
	        return bullNumber+"A"+cowNumber+"B";
	    }
		
}
