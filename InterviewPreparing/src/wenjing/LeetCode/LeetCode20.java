package wenjing.LeetCode;

import java.util.LinkedList;
/*
 * ֮ǰ�����ģ��������������ˡ� ��������ά��һ��stack�� ��������{����ʱ����ջ��Ȼ������}��)��ʱ���ջ����ջ��ʱ�����Ƿ��ǰ��ƥ�伴�ɡ�
ע���и�С���� ���ǵ�stringȫ������һ���Ժ� Ҫ��� stack�Ƿ�Ϊ�� ֻ��Ϊ�� ����true��

 */
public class LeetCode20 {

	 public boolean isValid(String s) {
	     if(s==null||s.length()==0){
	    	 return true;
	     }
		 
		 LinkedList<Character> stack = new LinkedList<>();
	     char[] resultString = s.toCharArray();
	     
	    for(int i = 0;i<resultString.length;i++){
	    	
	    	char thisChar= resultString[i];
	    	switch (thisChar){
	    	case '(':
	    	case '[':
	    	case '{':
	    		stack.push(thisChar);
	    		break;
	    	case ')':
	    		if(stack.isEmpty()||stack.pop()!=')')
	    			return false;
	    		break;
	    	case ']':
	    		if(stack.isEmpty()||stack.pop()!=']')
	    			return false;
	    		break;
	    	case '}':
	    		if(stack.isEmpty()||stack.pop()!='}')
	    			return false;
	    		break;
	    	default:
	    		break;
	    	}
	    }
	     
	    if(stack.isEmpty()){
	    	return true;
	    }
	     
		 return false;
    
	 }
	
	
}
