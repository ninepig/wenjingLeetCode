//package wenjing.LeetCode;
///*
// * Given s = "hello", return "olleh".
// * �����ܼ򵥡�����Ч�ʺܵ�
// * ����ѧ��������򽻻��ַ���̫ţ����
// *
// *
// *
// * ����a��b��ֵ�ķ�����
//                    a = a^b;
//                    b = a^b;
//                    a = a^b;
//�������룬����̫�����ˣ���ʵ����������֪�������������x���㣺
//                               x^x == 0;
//                               x^0 == x;
//��ô�����ʽ����ʵ�������������ϵĹ���������a������a^b�� ֵ������b = a ^ b = (a^b)^b=a^b^b=a^(b^b)=a^0=a�������ͳɹ���ʵ����b = a��
//��������a = a^b = (a^b)^b����һ��b����ԭ����b�����ڶ���b�Ѿ���a��ֵ����Ϊǰ���Ѿ�ʵ���˽�����= (a^b)^a = a^a^b = 0^b = b��������ʵ����a = b��
//���ǣ��ͳɹ���ʵ����a��b����ֵ�Ľ���
// */
//public class Leetcode344 {
//	 public String reverseString(String s) {
//
////		 if(s==null){
////			 return null;
////		 }
////
////		 //trick �ĵط�������ַ���Ϊ�գ���Ҫ���ؿ�
////		 if(s==""){
////			 return "";
////		 }
//		//��������ʽ����
//		 if(s==null||s==""){
//			 return s;
//		 }
//
//		 StringBuffer resultString = new StringBuffer();
//		 int StringLength = s.length();
//
//		 for(int i=StringLength-1;i>=0;i--){
//			 resultString.append(s.charAt(i));
//		 }
//
//		 return resultString.toString();
//
//	    }
//	 //����һ��̫��ʱ���ˣ�������pointer���ã���ΪֻҪǰ�󻻾Ϳ�����, ǰ�󻥻�
//	 public String reverseString(String s) {
//
////		 if(s==null){
////			 return null;
////		 }
////
////		 //trick �ĵط�������ַ���Ϊ�գ���Ҫ���ؿ�
////		 if(s==""){
////			 return "";
////		 }
//		//��������ʽ����
//		 if(s==null||s==""){
//			 return s;
//		 }
//		 char[] charList = s.toCharArray();
//		 int listLength = charList.length;
//
//		 for(int i = 0; i<=(listLength-1)/2;i++){
//			 char temp = charList[i];
//			 charList[i] = charList[listLength-i-1];
//			 charList[listLength-i-1]=temp;
//		 }
//
//
//		 return charList.toString();
//
//	    }
//
//
//}
