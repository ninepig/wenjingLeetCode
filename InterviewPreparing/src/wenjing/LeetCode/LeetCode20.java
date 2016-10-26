package wenjing.LeetCode;

import java.util.LinkedList;
/*
 * 之前做过的，但是脑子忘记了。 这道题就是维护一个stack， 在遇到（{【的时候入栈，然后遇到}】)的时候出栈。出栈的时候检查是否和前面匹配即可。
注意有个小问题 就是当string全部走了一次以后 要检查 stack是否为空 只有为空 才是true的

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
