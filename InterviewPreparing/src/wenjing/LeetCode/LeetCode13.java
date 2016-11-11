package wenjing.LeetCode;

public class LeetCode13 {

	public int romanToInt(String s) {  
		  
	    if(s==null || s.length()==0)  
	        return 0;  
	    int res = 0;  
	    for(int i=0;i<s.length();i++)  
	    {  
	        switch(s.charAt(i))  
	        {  
	            case 'I':  
	                if(i<s.length()-1 && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X'))  
	                {  
	                    res -= 1;  
	                }  
	                else  
	                {  
	                    res += 1;  
	                }  
	                break;  
	            case 'V':  
	                res += 5;  
	                break;  
	            case 'X':  
	                if(i<s.length()-1 && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C'))  
	                {  
	                    res -= 10;  
	                }  
	                else  
	                {  
	                    res += 10;  
	                }  
	                break;  
	            case 'L':  
	                res += 50;  
	                break;  
	            case 'C':  
	                if(i<s.length()-1 && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M'))  
	                {  
	                    res -= 100;  
	                }  
	                else  
	                {  
	                    res += 100;  
	                }  
	                break;  
	            case 'D':  
	                res += 500;  
	                break;  
	            case 'M':  
	                res += 1000;  
	                break;  
	            default:  
	                return 0;  
	        }  
	    }  
	    return res;  
	}  
	
	 public int romanToInt(String s) {
	     	if(s==null||s.length()==0){
	     		return 0;
	     	}
	     	int result = 0 ;
	     	char[] charString = s.toCharArray();
	     	
	     	for(int i=0; i<s.length();i++){
	     		
	     		switch(s.charAt(i)){
	     		
	     		case'I':
	     			if(i<s.length()-1&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
	     				result = result-1;
	     			}else{
	     				result = result+1;
	     			}
	     			break;
	     		case'V':
	     			result = result+5;
	     			break;
	     		case'X':
	     			if(i<s.length()-1&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
	     				result = result -10;
	     			}else{
	     				result = result +10;
	     			}
	     			break;
	     		case'L':
	     			result = result+50;
	     			break;
	     		case'C':
	     			if(i<s.length()-1&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
	     				result = result -100;
	     			}else{
	     				result = result +100;
	     			}
	     			break;
	     		case'D':
	     			result = result+500;
	     			break;
	     		case'M':
	     			result = result+1000;
	     			break;
	     		default:
	     			break;
	     			
	     		
	     		}
	     		
	     	}
	     	
	     	return result;
		 
	    }
	
	
	
	
}
